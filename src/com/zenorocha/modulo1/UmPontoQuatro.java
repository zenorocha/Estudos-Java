/*
 * Módulo 1
 * Projeto e Construção de Sistemas
 * Professor: Alexandre Correa
 * 
 * Implementado por Zeno Rocha
 * Em 17/03/2011
 * 
 * --------------------------------------------------------------------------------------------
 * 
 * Programa 1.4
 * 
 *	Dado o número 1234.5678, escreva um programa que armazene em uma variável inteira
 *	(short) a parte inteira (1234) e em uma outra variável inteira o valor decimal (5678).
 *	Imprima as duas variáveis inteiras resultantes da seguinte forma:
 *	Parte Inteira: 1234 e Parte Flutuante: 5678
 * 
 */

package com.zenorocha.modulo1;

public class UmPontoQuatro {
	private double valor;
	private short inteira;
	private int decimal;
	
	public UmPontoQuatro() {
		
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public short getInteira() {
		return inteira;
	}

	public void setInteira(short inteira) {
		this.inteira = inteira;
	}

	public int getDecimal() {
		return decimal;
	}

	public void setDecimal(int decimal) {
		this.decimal = decimal;
	}
	
	public void manipulaValor() {
		inteira = (short)Math.floor(valor);
		
		String aux = Double.toString(valor);
		aux = aux.substring(aux.indexOf(".") + 1);
		
		decimal = Integer.parseInt(aux);
	}
	
	public void Print() {
		System.out.println("Parte Inteira: " + inteira);
		System.out.println("Parte Flutuante: " + decimal);
	}
	
	public static void main(String[] args) {
		UmPontoQuatro objUmPontoQuatro = new UmPontoQuatro();
		
		objUmPontoQuatro.setValor(1234.5678);
		objUmPontoQuatro.manipulaValor();
		objUmPontoQuatro.Print();
	}
}
