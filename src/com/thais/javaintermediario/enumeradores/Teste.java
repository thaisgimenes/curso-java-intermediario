package com.thais.javaintermediario.enumeradores;

public class Teste {

	public static void main(String[] args) {
		
		//Testes com constantes e com enum;
		usandoConstantes();
		System.out.println("");
		usandoEnum();
		
		System.out.println("");
		//Teste usando enum com valor;
		DiaSemana dia = DiaSemana.DOMINGO;
		System.out.println(dia.toString() + " - " + dia.getValor());
		
		//Teste passando a data e o dia da semana com o enum;
		Data data = new Data(1, 4, 2016, DiaSemana.SEXTA);
		
		//Teste mostrando os dias da semana do enum DiaSemana;
		DiaSemana[] dias = DiaSemana.values();
		
		for(int i = 0; i < dias.length; i++) {
			System.out.println(dias[i]);
		}
		
		System.out.println("");
		
		//Utilizando values e valueOf;
		for(DiaSemana diaSemana : DiaSemana.values()){
			System.out.println(diaSemana);
		}
		
		System.out.println("");
		
		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
		DiaSemana day = Enum.valueOf(DiaSemana.class, "DOMINGO");
		System.out.println(day);

	}
	
	private static void usandoConstantes() {
		int segunda = DiaSemanaConstantes.SEGUNDA;
		int terca = DiaSemanaConstantes.TERCA;
		int quarta = DiaSemanaConstantes.QUARTA;
		int quinta = DiaSemanaConstantes.QUINTA;
		int sexta = DiaSemanaConstantes.SEXTA;
		int sabado = DiaSemanaConstantes.SABADO;
		int domingo = DiaSemanaConstantes.DOMINGO;
		
		System.out.println("Teste utilizando constantes no Java!");
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
		imprimeDiaSemana(domingo);
	}
	
	private static void imprimeDiaSemana(int dia) {
		switch(dia) {
		case 1:
			System.out.println("Segunda-feira");
			break;
		case 2:
			System.out.println("Ter?a-feira");
			break;
		case 3:
			System.out.println("Quarta-feira");
			break;
		case 4:
			System.out.println("Quinta-feira");
			break;
		case 5:
			System.out.println("Sexta-feira");
			break;
		case 6:
			System.out.println("Sabado-feira");
			break;
		case 7:
			System.out.println("Domingo-feira");
			break;
		}
	}
	
	private static void usandoEnum(){
		
		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana terca = DiaSemana.TERCA;
		DiaSemana quarta = DiaSemana.QUARTA;
		DiaSemana quinta = DiaSemana.QUINTA;
		DiaSemana sexta = DiaSemana.SEXTA;
		DiaSemana sabado = DiaSemana.SABADO;
		DiaSemana domingo = DiaSemana.DOMINGO;
		
		System.out.println("Teste utilizando enum no Java!");
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
		imprimeDiaSemana(domingo);
	}
	
	private static void imprimeDiaSemana(DiaSemana dia) {
		switch(dia) {
		case SEGUNDA:
			System.out.println("Segunda-feira");
			break;
		case TERCA:
			System.out.println("Ter?a-feira");
			break;
		case QUARTA:
			System.out.println("Quarta-feira");
			break;
		case QUINTA:
			System.out.println("Quinta-feira");
			break;
		case SEXTA:
			System.out.println("Sexta-feira");
			break;
		case SABADO:
			System.out.println("Sabado-feira");
			break;
		case DOMINGO:
			System.out.println("Domingo-feira");
			break;
		}
	}

}
