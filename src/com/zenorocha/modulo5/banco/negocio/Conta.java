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

package com.zenorocha.modulo5.banco.negocio;

import com.zenorocha.modulo5.*;

public class Conta {
	private String numero;
	private double saldo;
	
	public Conta(String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void debitar(double valor) throws BancoAppException {
		if (valor > 0) {
			if (valor < 2000) {
			
				double temp = this.saldo;
				temp -= valor;
				
				if ((temp >= 0)) {
					this.saldo -= valor;
				}
				else {
					throw new BancoAppException("Erro: A conta tem que ter um valor maior ou igual a zero apos o debito.");	
				}
			}
			else {
				throw new BancoAppException("Erro: O limite debito e de 2.000,00.");
			}
		}
		else {
			throw new BancoAppException("Erro: O valor a debitar tem que ser um numero positivo maior que zero.");
		}
	}
	
	public void creditar(double valor) throws BancoAppException {
		if (valor > 0) {
			this.saldo += valor;	
		}
		else {
			throw new BancoAppException("Erro: O valor a creditar tem que ser um numero positivo maior que zero.");
		}
	}
	
	
}
