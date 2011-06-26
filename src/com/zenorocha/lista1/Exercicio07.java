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
 * Exercício 7
 * 
 * 	Escreva um programa que recebe do usuário o menor número e o maior de uma faixa de
 * 	inteiros. O programa, então, calcula e imprime:
 * 
 * 	A soma dos inteiros que estão na faixa (incluindo os da ponta),
 * 	O número de inteiros dentro da faixa.
 * 	O número de inteiros ímpares na faixa
 * 	
 * 	Além disso, o programa deve imprimir, para cada número do intervalo, se ele é par ou
 * 	impar e uma relação dos seus divisores.
 * 	
 * 	Se o número menor for maior que o número maior, o programa deve exibir uma mensagem de erro e encerrar sua execução.
 * 
 */

package com.zenorocha.lista1;

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        
        int limInferior;
        int limSuperior;
        int resultado = 0;
        
        System.out.print("Entre com o limite inferior: ");
        limInferior = input.nextInt();

        System.out.print("Entre com o limite superior: ");
        limSuperior = input.nextInt();
        
        if (limInferior > limSuperior) {
        	System.err.println("Erro: Limite inferior é maior que o limite superior.");
        	System.exit(0);
        }
        
        System.out.println("mínimo: " + limInferior);
        System.out.println("máximo: " + limSuperior);

        for (int i = limInferior; i <= limSuperior; i++) {
            resultado += i;
        }
        
        System.out.println("soma: " + resultado);
        
        for (resultado = limInferior; resultado < (limSuperior - 1); resultado++) {
            // apenas incremente
        }
        
        System.out.println("qtde números: " + resultado);
        
        resultado = 0;
        
        for (int i = limInferior; i <= limSuperior; i++) {
            if ((i % 2) != 0)
                resultado++;
        }
        
        System.out.println("n. ímpares: " + resultado);
        
        resultado = 0;
        
        for (int i = limInferior; i <= limSuperior; i++) {
        	
        	boolean isFirstRun = true;
        	
        	for (int j = limInferior; j <= limSuperior; j++) {
        		
        		if ((i % j) == 0) {
        			
        			if (isFirstRun) {
        				System.out.print("Divisores de " + i + ": " + j);
        				isFirstRun = false;
        			}
        			else {
        				System.out.print(", " + j);
        			}
        		}
        		
        		if (j == limSuperior)
					System.out.println("");
        	}
        	    
        }
		
		/*if ((this.valor % 2) == 0)
			System.out.println("Esse valor é par");
		else
			System.out.println("Esse valor é ímpar");*/
	}
	
}
