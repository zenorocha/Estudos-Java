/*
 * Modulo 1
 * Projeto e Construcao de Sistemas
 * Professor: Alexandre Correa
 * 
 * Implementado por Zeno Rocha
 * Em 17/03/2011
 * 
 * --------------------------------------------------------------------------------------------
 * 
 * Programa 2.6
 * 
 *	Escreva um programa que sorteie dez números inteiros e imprima os números sorteados, o
 *	total de números pares sorteados, o total de números ímpares sorteados, o maior número
 *	sorteado e o menor número sorteado.
 * 
 */

package com.zenorocha.modulo1;

public class DoisPontoSeis {
	
	public DoisPontoSeis() {
		
	}
	
	public static void main(String[] args) {
		int vetor[] = new int[10];
		int pares = 0;
		int impares = 0;
		int maior = 0;
		int menor = 101;
		
		for (int i = 0; i < 10; i++) {
			
			vetor[i] = (int)(Math.random() * 100);
			System.out.println("Foi sorteado o numero: " + vetor[i]);
			
			if ((vetor[i] % 2) == 0)
				pares++;
			else
				impares++;
		}
		
		System.out.println("Quantidade de números pares: " + pares);
		System.out.println("Quantidade de números ímpares: " + impares);
		
		for (int j = 0; j < vetor.length; j++) {
			if (vetor[j] > maior) {
					maior = vetor[j];
			}
			
			if (vetor[j] < menor) {
				menor = vetor[j];
			}
		}
		
		System.out.println("Maior número sorteado: " + maior);
		System.out.println("Menor número sorteado: " + menor);
		
	}
}
