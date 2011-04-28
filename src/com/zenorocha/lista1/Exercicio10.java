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
 * Exercício 10
 * 
 * 	Faça um programa que o usuário entre o raio e o programa imprime a área e o volume de uma esfera.
 * 
 * 	Área = 4 * PI * r2
 * 	Volume = 4/3 * PI * r3
 * 
 */

package com.zenorocha.lista1;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		int raio;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entre com o raio: ");
		raio = scanner.nextInt();
		
		System.out.println(4 * Math.PI * Math.pow(raio, 2));
		System.out.println((4/3) * Math.PI * Math.pow(raio, 3));
	}
}
