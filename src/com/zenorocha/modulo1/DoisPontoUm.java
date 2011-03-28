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
 * Programa 2.1
 * 
 *	Escreva um programa que dado um número inteiro, entrado via argumento do programa,
 *	determine se ele é par ou ímpar.
 * 
 */

package com.zenorocha.modulo1;

import java.util.Scanner;

public class DoisPontoUm {
	private int valor;
	
	public DoisPontoUm(){
		
	}
	
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public void defineParOuImpar() {
		if ((this.valor % 2) == 0)
			System.out.println("Esse valor é par");
		else
			System.out.println("Esse valor é ímpar");
	}

	public static void main(String[] args) {

		DoisPontoUm objDoisPontoUm = new DoisPontoUm();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor de entrada");
		
		objDoisPontoUm.setValor(scanner.nextInt());
		objDoisPontoUm.defineParOuImpar();
	}
}
