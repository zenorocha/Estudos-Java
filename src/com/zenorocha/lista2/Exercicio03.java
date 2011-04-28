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
 * Exercício 3
 * 
 * 	Escreva um programa onde o usuário entra com seu valor de seu salário ao longo de 12
 * 	meses e o programa calcula o imposto de renda devido. O valor deve ser calculado segundo a tabela abaixo:
 * 
 * 	- Base de cálculo mensal em R$
 * 	a) Até 1.499,15
 * 	b) De 1.499,16 até 2.246,75
 * 	c) De 2.246,76 até 2.995,70
 * 	d) De 2.995,71 até	3.743,19
 * 	e) Acima de 3.743,19
 * 
 * - Parcela a deduzir do imposto em R$
 * a) 112,43
 * b) 280,94
 * c) 505,62
 * d) 692,78
 * 
 * I) Escreva sua solução usando BigDecimal
 * II) Escreva outra solução usando números inteiros.
 * 
 */

package com.zenorocha.lista2;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String args[]) {

        BigDecimal resultadoA = new BigDecimal("0.00");
        int resultadoB = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o valor do seu salário ao longo do ano: ");
        resultadoA = scanner.nextBigDecimal();
        resultadoB = resultadoA.intValue();

        System.out.println("\n" + resultadoA);

        if ()

    }
}
