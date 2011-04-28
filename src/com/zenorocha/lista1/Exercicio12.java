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
 * Exercício 12
 * 
 * 	Escreva um programa que calcula e imprime a nota de uma avaliação de PCS da seguinte
 * 	forma: o usuário entra o valor da avaliação prática (número inteiro de 0 a 100). Se o valor
 * 	for maior ou igual a 70, o programa pergunta se o usuário fez a prova. Se o usuário
 * 	responder sim, o programa pede para o usuário entrar a nota da prova (número inteiro
 * 	entre 0 e 100). Se o valor da avaliação prática for menor que 70, o programa pede para o
 * 	usuário entrar a nota da prova (a prova, neste caso, é obrigatória). O valor da nota de uma
 * 	avaliação obedece a seguinte regra:
 * 
 * 	Seja AP = nota avaliação prática e P = nota prova.
 * 	Se AP >= 70 e não fez prova P:
 * 		Nota = AP
 *  Se AP >= 85 e fez prova P:
 *  	Nota = (Maior Nota * 4 + Menor Nota) / 5
 *  Se AP >= 70 e AP < 85 e fez prova P:
 *  	Nota = (Maior Nota * 3 + Menor Nota) / 4
 *  Se AP >= 50 e AP < 70:
 *  	Nota = (Maior Nota * 2 + Menor Nota) / 3
 *  Se AP < 50:
 *  	Nota = (AP + P) / 2
 * 
 */

package com.zenorocha.lista1;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int ap;
		int p;
		
		int maior = 0;
		int menor = 0;
		
		boolean resposta;
		
		System.out.print("Entre com a nota da avaliação prática: ");
		ap = scanner.nextInt();
		
		if (ap >= 70) {
			System.out.print("Você fez a prova? Digite: 1 para Sim e 0 para Não");
			resposta = scanner.nextBoolean();
			
			if (resposta) {
				
				System.out.print("Entre com a nota da prova: ");
				p = scanner.nextInt();
				
				if (p > ap) {
					maior = p;
					menor = ap;
				}
				else {
					maior = ap;
					menor = p;
				}
				
				if (ap >= 85) {
					p = ((maior * 4) + menor) / 5;
				}
				else {
					p = ((maior * 3) + menor) / 4;
				}
			}
			else {
				p = ap;
				
				if (p > ap) {
					maior = p;
					menor = ap;
				}
				else {
					maior = ap;
					menor = p;
				}
				
				if (ap >= 50)
					p = ((maior * 2) + menor) / 3;
				else
					p = (ap + p) / 2;
			}
		}
		else {
			System.out.print("Entre com a nota da prova: ");
			p = scanner.nextInt();
		}
	}
}
