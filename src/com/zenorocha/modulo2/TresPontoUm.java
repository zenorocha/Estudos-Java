/*
 * Modulo 2
 * Projeto e Construcao de Sistemas
 * Professor: Alexandre Correa
 * 
 * Implementado por Zeno Rocha
 * Em 18/03/2011
 * 
 * --------------------------------------------------------------------------------------------
 * 
 * Programa 3.1
 * 
 *	Escreva um programa que dado um valor numérico (armazenado em uma variável inteira),
 *	imprima cada um dos seus dígitos por extenso da esquerda para a direita e vice-versa.
 *	Ex: 4571:
 *	Resultado:
 *	quatro cinco sete um
 *	um sete cinco quatro
 * 
 */

package com.zenorocha.modulo2;

import java.util.Scanner;

public class TresPontoUm {

	private String entrada;
	private String entradaInvertida;
	private String vetorExtenso[] = {"zero", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove"};
	
	public TresPontoUm() {	
		
	}
	
	public String getEntrada() {
		return entrada;
	}

	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}

	public String getEntradaInvertida() {
		return entradaInvertida;
	}

	public void setEntradaInvertida(String entradaInvertida) {
		this.entradaInvertida = entradaInvertida;
	}
	
	public String inverteString(String a) {
		StringBuffer sb = new StringBuffer(a);
		sb.reverse();
		return sb.toString();
	}
	
	public void convertePorExtenso(String entrada) {
		String convertida = "";
		
		for (int j = 0; j < entrada.length(); j++) {
			String retorno = converteCadaCaracter(entrada.charAt(j));
			convertida += retorno + " ";
		}
		
		System.out.println(convertida);
	}
	
	public String converteCadaCaracter(char caracter) {
		int aux = Character.getNumericValue(caracter);
		return vetorExtenso[aux];
	}
	
	public static void main(String[] args) {
		TresPontoUm objTresPontoUm = new TresPontoUm();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com um valor qualquer");
		
		objTresPontoUm.setEntrada(scanner.next());
		objTresPontoUm.setEntradaInvertida(objTresPontoUm.inverteString(objTresPontoUm.getEntrada()));
		
		objTresPontoUm.convertePorExtenso(objTresPontoUm.getEntrada());
		objTresPontoUm.convertePorExtenso(objTresPontoUm.getEntradaInvertida());
	}
	
	
}
