/*
 * Modulo 5
 * Projeto e Construcao de Sistemas
 * Professor: Alexandre Correa
 * 
 * Implementado por Zeno Rocha
 * Em 03/04/2011
 * 
 * --------------------------------------------------------------------------------------------
 * 
 * Passo 2: Construir a classe BancoUI (interface com o usuário)
 * 
 * 	Faça uma classe BancoUI que corresponderá a uma interface com usuário rudimentar via 
 * 	console que deverá se comportar da seguinte forma:
 * 
 * 	A classe BancoUI deverá instanciar o objeto Conta que será manipulado durante a
 * 	execução do programa. Antes de instanciar o objeto Conta, porém, BancoUI deverá
 * 	perguntar para o usuário o número e o saldo inicial que serão passados para o construtor do
 * 	objeto Conta.
 * 
 * 	A operação do programa será baseada em um menu textual em console (não se preocupem
 * 	com coisas do tipo limpar a tela, e etc), com as seguintes opções:
 * 
 * 		1 – creditar na conta
 * 		2 – debitar da conta
 * 		3 – consultar saldo
 * 		4 – finalizar o programa
 * 
 * 	Se o usuário entrar a opção 1, o programa deverá perguntar o valor a ser creditado. O
 * 	usuário entrará o valor e a classe BancoUI chamará diretamente a operação creditar com o
 * 	valor passado. Caso haja uma exceção, o programa deverá exibir a mensagem de erro
 * 	correspondente. Caso contrário o programa deverá apresentar a mensagem “Operação bem sucedida”.
 * 	
 * 	Se o usuário entrar a opção 2, o programa deverá perguntar o valor a ser creditado. O
 * 	usuário entrará o valor e a classe BancoUI chamará diretamente a operação creditar com o
 * 	valor passado. Caso haja uma exceção, o programa deverá exibir a mensagem de erro
 * 	correspondente. Caso contrário, o programa deverá apresentar a mensagem “Operação bem sucedida”.
 * 	
 * 	Se o usuário entrar a opção 3, o programa deverá apresentar o valor atual do saldo da conta.
 * 
 * 	Após executar qualquer destas três opções, o programa deverá apresentar novamente o menu de opções.
 * 	
 * 	ATENÇÃO: Defina a classe BancoUI no pacote banco.ui.
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
