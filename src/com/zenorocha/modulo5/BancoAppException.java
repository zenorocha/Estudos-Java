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

package com.zenorocha.modulo5;

public class BancoAppException extends Exception {
	
	// wtf?
	private static final long serialVersionUID = 1L;

	public BancoAppException(final String erro) {
		//System.out.println(erro);
		System.err.println(erro);
	}
}
