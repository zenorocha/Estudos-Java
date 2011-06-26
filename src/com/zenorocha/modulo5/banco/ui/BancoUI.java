/*
 * Módulo 5
 * Projeto e Construção de Sistemas
 * Professor: Alexandre Correa
 * 
 * Implementado por Zeno Rocha
 * Em 03/04/2011
 * 
 * --------------------------------------------------------------------------------------------
 * 
 * Passo 1: Construir as classes Conta e BancoAppException
 * 	
 * 	Classe Conta:
 * 		Atributos:
 * 			• numero (string)
 * 			• saldo (double)
 * 
 * 		Operações:
 * 			• Construtor com os parâmetros numero da conta e saldo inicial.
 * 			• Operação: debitar (parâmetro: valor) -> acumula valor no saldo da conta.
 * 			• Operação: creditar (parâmetro: valor) -> debita valor do saldo da conta.
 * 
 * 	Considere as seguintes regras:
 * 
 * 	a) debitar:
 * 		• valor a debitar tem que ser um número positivo maior que zero.
 * 		• conta tem que ter saldo suficiente para o débito, isto é, a conta tem que ter
 * 		um valor maior ou igual a zero após o débito.
 * 		• Existe um limite para o valor a debitar que é de 2.000,00. O limite é por
 * 		operação de débito (suponha que não exista limite diário).
 * 	
 * 	b) creditar:
 * 		• valor a creditar tem que ser um número positivo maior que zero.
 * 
 * 	Em caso de falha nessas regras, a implementação da operação (debitar ou creditar) deve
 * 	arremessar uma exceção do tipo BancoAppException (que deve ser criada por você,
 * 	estendendo a classe Exception já existente no Java) com uma mensagem de erro
 * 	correspondente ao problema.
 * 
 * 	ATENÇÃO: Defina a classe Conta no pacote banco.negocio
 * 
 */

package com.zenorocha.modulo5.banco.ui;

import java.util.Scanner;

import com.zenorocha.modulo5.BancoAppException;
import com.zenorocha.modulo5.banco.negocio.Conta;

public class BancoUI {
	
	public BancoUI() {
		
	}
	
	public void start() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o numero da sua conta: ");
		String numero = scanner.next();
		
		System.out.println("Informe o saldo inicial da sua conta: ");
		double saldo = scanner.nextDouble();
		
		Conta conta = new Conta(numero, saldo);
		
		int opcao = 1;
		
		while (opcao == 1) {
			System.out.println("1 - Creditar na conta");
			System.out.println("2 - Debitar na conta");
			System.out.println("3 - Consultar saldo");
			System.out.println("4 - Finalizar o programa");
			
			int escolha = scanner.nextInt();
			
			switch (escolha) {
			case 1:
				System.out.println("Entre com o valor a ser creditado: ");
				
				try {
					conta.creditar(scanner.nextDouble());
					System.out.println("\nOperacao bem sucedida.\n");
				}
				catch (BancoAppException e) {
					break;
				}
				
				break;
			case 2:
				System.out.println("Entre com o valor a ser debitado: ");
				
				try {
					conta.debitar(scanner.nextDouble());
					System.out.println("Operacao bem sucedida.");
				}
				catch (BancoAppException e) {
					break;
				}
				
				break;
			case 3:
				System.out.println("Seu saldo atual e de: " + conta.getSaldo());
				break;
			case 4:
				opcao = 0;
				break;

			default:
				System.out.println("Entre com uma opcao valida entre 1 e 4.");
				break;
			}
		}
	}
	
}
