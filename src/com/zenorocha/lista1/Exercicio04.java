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
 * Exercício 4
 * 
 * 	Desenvolva um programa em Java que permita que defina duas varíaveis com números
 * 	float (a, b) e outras duas variáveis com números double (c, d), inicializadas no próprio
 * 	programa e imprima os seguintes valores:
 * 
 * 		a) Soma (a+b) e (c+d)
 * 		b) Multiplicação (a * b) e c * d)
 * 		c) Subtração (a – b) e (c – d)
 * 		d) Divisão (a / b) e (c / d)
 * 		e) Experimente imprimir o resultado da seguinte subtração 2.0 – 1.1
 * 		f) Experimente imprimir o resultado da comparação de 0.9 com o resultado da seguinte subtração 2.0 – 1.1
 * 		g) Imprima o resultado de Float.MAX_VALUE e Double.MAX_VALUE.
 * 
 */

package com.zenorocha.lista1;

public class Exercicio04 {

	public static void main(String[] args) {
		
		float a = 1;
		float b = 2;
		
		double c = 3;
		double d = 4;
		
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
