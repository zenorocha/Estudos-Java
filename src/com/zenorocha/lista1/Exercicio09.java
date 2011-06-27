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
 * Exercício 9
 * 
 * 	O que faz a programa abaixo?
 * 
	public static void main(String[] args) {
	int total = 0;
	int i = 0;
	while (true)
	{
	if (i % 2 == 0)
	{
	i = i + 1;
	continue;
	}
	total += i;
	if (i > 10)
	break;
	i = i + 1;
	}
	System.out.println(" i = " + i);
	System.out.println(" total = " + total);
	}
	
 *	Como este programa pode ser reescrito com menos linhas?
 * 
 */

package com.zenorocha.lista1;

public class Exercicio09 {

	public static void main(String[] args) {
		
		int total = 0;
		int i = 0;
		
		while (true)
		{
			if (i % 2 == 0)
			{
				i = i + 1;
				continue;
			}
			
			total += i;
		
			if (i > 10)
				break;
		
			i = i + 1;
		}
		
		System.out.println(" i = " + i);
		System.out.println(" total = " + total);	
	}
}
