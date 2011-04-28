/*
 * Lista 1
 * Projeto e Construção de Sistemas
 * Professor: Alexandre Correa
 * 
 * Implementado por Zeno Rocha
 * Em 25/04/2011
 * 
 * --------------------------------------------------------------------------------------------
 * 
 * Exercício 6
 * 
 * 	Modifique o programa elaborado no exercício 2 para entrar os valores das variáveis (a,b,c,d) via console.
 * 
 */

package com.zenorocha.lista1;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		float a;
		float b;
		
		double c;
		double d;
		
		System.out.print("Entre com o valor da variável A: ");
		a = scanner.nextFloat();
		
		System.out.print("Entre com o valor da variável B: ");
		b = scanner.nextFloat();
		
		System.out.print("Entre com o valor da variável C: ");
		c = scanner.nextDouble();
		
		System.out.print("Entre com o valor da variável D: ");
		d = scanner.nextDouble();
		
		System.out.println("Soma: " + (a + b) + " e "+ (c + d));
		System.out.println("Multiplicação: " + (a * b) + " e "+ (c * d));
		System.out.println("Subtração: " + (a - b) + " e "+ (c - d));
		System.out.println("Divisão: " + (a / b) + " e "+ (c / d));
		
		System.out.println(2.0 - 1.1);
		System.out.println(0.9 == (2.0 - 1.1));
		
		System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
	}
	
}
