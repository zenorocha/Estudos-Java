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
 * Exercício 15
 * 
 * 	Sejam dois produtos A e B e seus respectivos preços:
 * 
 * 	Produto A
 * 		Para quantidade até 5 => preço unitário = R$ 10,00
 * 		Para quantidade > 5 => preço unitário = R$ 8,00
 * 
 * 	Produto B
 * 		Para quantidade até 10 => preço unitário = R$ 20,00
 * 		Para quantidade > 10 e até 20 => preço unitário = R$ 18,00
 * 		Para quantidade > 20 => preço unitário = R$ 16,00
 * 
 * 	Faça um programa que peça para o usuário entrar a quantidade desejada dos produtos A e B e imprima a seguinte saída:
 * 
 * 	A: Quantidade: <x1>; Preço Unitário: <y1>; Total: <z1>
 * 	B: Quantidade: <x2>; Preço Unitário: <y2>; Total: <z2>
 * 	Total Geral: <z3>
 * 
 * 	Onde x1 e x2 são entrados pelo usuário
 * 	y1 e y2 são obtidos pela tabela de descontos conforme a quantidade entrada pelo usuário
 * 	z1 e z2 são o resultado de x * y.
 * 	z3 = z1 + z2
 * 
 * 	Ao final de uma execução, o programa deve perguntar ao usuário se ele deseja entrar uma nova quantidade
 * 	de A e B. Se sim, o procedimento acima é repetido, sendo que o programa deve acumular as quantidades
 * 	pedidas dos produtos A e B, caso contrário, o programa finaliza a execução imprimindo o valor acumulado
 * 	de A, B e o total geral.
 * 
 */

package com.zenorocha.lista1;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int x1, x2; // quantidade
		double y1 = 0, y2 = 0; // preço unitário
		double z1 = 0, z2 = 0; // preço total
		double z3 = 0; //total geral
		
		boolean resposta = true;
		int numPedido = 1;
		
		
		while (resposta) {
			
			System.out.print("\nEntre quantidade para o produto A: ");
			x1 = scanner.nextInt();
			
			if (x1 <= 5)
				y1 = 10;
			else
				y1 = 8;
			
			z1 = x1 * y1;
			
			System.out.print("Entre quantidade para o produto B: ");
			x2 = scanner.nextInt();
			
			if (x2 < 10)
				y2 = 20;
			else if ((x2 > 10) && (x2 <= 20))
				y2 = 18;
			else
				y2 = 16;
			
			z2 = x2 * y2;
			z3 = z1 + z2;
			
			System.out.println("\nPedido " + numPedido + ":");
			System.out.println("A: Quantidade: " + x1 + "; Preço Unitário: " + y1 + "; Total: " + z1);
			System.out.println("B: Quantidade: " + x2 + "; Preço Unitário: " + y2 + "; Total: " + z2);
			System.out.println("Total Geral: " + z3);
			
			System.out.print("\n Novo pedido (0 - Não / 1 - Sim)? ");
			resposta = Boolean.parseBoolean(scanner.next());
			
			numPedido++;
		}
		
		
	}
}
