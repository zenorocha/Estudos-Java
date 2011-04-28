/*
 * Lista 2
 * Projeto e Construção de Sistemas
 * Professor: Alexandre Correa
 * 
 * Implementado por Zeno Rocha
 * Em 27/04/2011
 * 
 * --------------------------------------------------------------------------------------------
 * 
 * Exercício 1
 * 
 * 	Faça um programa que, a partir de um string entrado pelo usuário, imprima:
 * 
 * 		a) Se o string é um palíndromo ou não.
 * 		b) O número de caracteres do string.
 * 		c) O número de vogais do string.
 * 		d) O número de dígitos (0 a 9) do string.
 * 		e) O string com todas suas letras em maiúsculas.
 * 		f) Se o string entrado começa com “BRA” (ignorando maiúsculas/minúsculas).
 * 		g) Se o string entrado termina com “SIL” (ignorando maiúsculas/minúsculas).
 * 		h) Se o string entrado possui alguma ocorrência de “LA” (ignorando maiúsculas/minúsculas).
 * 
 */

package com.zenorocha.lista2;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String entrada = "";
		char[] vogais = {'a', 'e', 'i', 'o', 'u'};
                char[] digitos = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		System.out.print("Entre com uma string qualquer: ");
		
		entrada = scanner.next();
		
		int i = 0;
		boolean isPalindromo = true;
		
		while (i < entrada.length()) {
			if (entrada.charAt(i) != entrada.charAt(entrada.length() - i - 1)) {
				isPalindromo = false;
			}
			
			i++;
		}
		
		if (isPalindromo) 
			System.out.println("a) É um Palíndromo");
		else
			System.out.println("a) Não é Palíndromo");
		
		System.out.println("b) Número de caracteres = " + entrada.length());

                int vogalIterator = 0;
		
		for (int j = 0; j < entrada.length(); j++) {
			for (int k = 0; k < vogais.length; k++) {
				if(entrada.charAt(j) == vogais[k]) {
					vogalIterator++;
				}
			}
		}

                System.out.println("c) Número de vogais = " + vogalIterator);

                int digitoIterator = 0;

		for (int j = 0; j < entrada.length(); j++) {
			for (int k = 0; k < digitos.length; k++) {
                            if(entrada.charAt(j) == digitos[k]) {
					digitoIterator++;
				}
			}
		}

                System.out.println("d) Número de dígitos = " + digitoIterator);
                System.out.println("e) " + entrada.toUpperCase());

                String bra = "BrA";
                String sil = "sIL";
                
                if (bra.equalsIgnoreCase(entrada.substring(0, 3)))
                    System.out.println("f) String começa com 'BRA'");
                else
                    System.out.println("f) String NÃO começa com 'BRA'");

                if (sil.equalsIgnoreCase(entrada.substring(entrada.length() - 3)))
                    System.out.println("g) String termina com 'SIL'");
                else
                    System.out.println("g) String NÃO termina com 'SIL'");

                if (entrada.contains("la") || entrada.contains("lA") || entrada.contains("La") || entrada.contains("LA"))
                    System.out.println("h) Possui ocorrência de 'LA'");
                else
                    System.out.println("h) NÃO possui ocorrência de 'LA'");
	}
}
