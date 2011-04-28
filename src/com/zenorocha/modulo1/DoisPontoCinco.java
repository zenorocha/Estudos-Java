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
 * Programa 2.5
 * 
 *	Escreva um programa que imprima os números primos entre um limite inferior e um limite superior.
 * 
 */

package com.zenorocha.modulo1;

import java.util.Scanner;

public class DoisPontoCinco {
	private int limInferior;
	private int limSuperior;
	
	public DoisPontoCinco() {
		
	}
	
	public int getLimInferior() {
		return limInferior;
	}

	public void setLimInferior(int limInferior) {
		this.limInferior = limInferior;
	}

	public int getLimSuperior() {
		return limSuperior;
	}

	public void setLimSuperior(int limSuperior) {
		this.limSuperior = limSuperior;
	}
	
	public void defineNumeroPrimo() {
		for (int i = this.limInferior; i < this.limSuperior; i++) {
			//s� falta descobrir como faz pra descobrir um numero primo
		}
	}
	
	public static void main(String[] args) {
		DoisPontoCinco objDoisPontoCinco = new DoisPontoCinco();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com um valor para o limite inferior do intervalo");
		objDoisPontoCinco.setLimInferior(scanner.nextInt());
			
		System.out.println("Entre com um valor para o limite superior do intervalo");
		objDoisPontoCinco.setLimSuperior(scanner.nextInt());
		
		objDoisPontoCinco.defineNumeroPrimo();
	}
}
