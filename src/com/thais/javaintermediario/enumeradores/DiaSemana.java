package com.thais.javaintermediario.enumeradores;

public enum DiaSemana {
	
	//Criando enums para representar dias da semana;
	
	SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);
	
	//Variavel para atribuir valor numerico ao enum;
	private int valor;
	
	DiaSemana(int valor){
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
}
