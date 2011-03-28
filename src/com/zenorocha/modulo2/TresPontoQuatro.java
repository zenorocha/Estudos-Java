/*
 * Módulo 2
 * Projeto e Construção de Sistemas
 * Professor: Alexandre Correa
 * 
 * Implementado por Zeno Rocha
 * Em 21/03/2011
 * 
 * --------------------------------------------------------------------------------------------
 * 
 * Programa 3.4
 * 
 *	Dado o array de strings do programa 3.4, gere duas strings: uma obtida concatenando-se os
 *	primeiros nomes de cada pessoa; e uma outra string obtida concatenando-se os últimos
 *	nomes de cada um. Ambas as strings devem ser geradas com os nomes separados por
 *	brancos e com todas as letras maiúsculas.
 * 
 */

package com.zenorocha.modulo2;

public class TresPontoQuatro {
	
	private final String arrayNomes[] = {"Paulo Henrique", "William José", "Maria Nascimento", "Carlos Eduardo", "Roberto Martins", "Sean Parker", "Mark Zuckenberg", "Joshua Davis", "Francisco Azevedo", "Fernando Torres", "Antonio Conceição", "Zeno Rocha", "Sergio Puntar", "Juliana Torroni", "Mariana Keller", "Bruno Silveira", "Victor dos Santos", "Karina Gomes", "Jorge Ben", "Ney Matogrosso"};
	private String primeiroNome;
	private String ultimoNome;
	
	public TresPontoQuatro() {
		this.primeiroNome = "";
		this.ultimoNome = "";
	}
	
	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}
	
	public void concatenaPrimeiroNome() {
		for (int i = 0; i < this.arrayNomes.length; i++) {
			this.primeiroNome = this.primeiroNome + this.arrayNomes[i].substring(0, this.arrayNomes[i].indexOf(" ")) + " ";
		}	
	}
	
	public void concatenaUltimoNome() {
		for (int i = 0; i < this.arrayNomes.length; i++) {
			this.ultimoNome = this.ultimoNome + this.arrayNomes[i].substring(this.arrayNomes[i].indexOf(" ") + 1) + " ";
		}	
	}
	
	public void Print() {
		System.out.println("Primeiros nomes: " + this.primeiroNome.toUpperCase());
		System.out.println("Últimos nomes: " + this.ultimoNome.toUpperCase());
	}

	public static void main(String[] args) {
		TresPontoQuatro objTresPontoQuatro = new TresPontoQuatro();
		
		objTresPontoQuatro.concatenaPrimeiroNome();
		objTresPontoQuatro.concatenaUltimoNome();
		objTresPontoQuatro.Print();
		
	}
	
}
