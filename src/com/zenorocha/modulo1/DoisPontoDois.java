/*
 * Módulo 1
 * Projeto e Construção de Sistemas
 * Professor: Alexandre Correa
 * 
 * Implementado por Zeno Rocha
 * Em 17/03/2011
 * 
 * --------------------------------------------------------------------------------------------
 * 
 * Programa 2.2
 * 
 *	Escreva um programa que dado um intervalo de números inteiros definidos por limInferior	
 *	e limSuperior, imprima o quadrado e o cubo de cada um desses números. Se o
 *	limiteSuperior for maior que 100 ou se o limiteSuperior for menor que limiteInferior uma
 *	mensagem de erro deve ser exibida. Faça o programa com o comando for. Os valores para
 *	limInferior e limSuperior devem ser entrados via argumentos do programa.
 * 
 */

package com.zenorocha.modulo1;

import java.util.Scanner;

public class DoisPontoDois {
	private int limInferior;
	private int limSuperior;
	
	public DoisPontoDois() {
		
	}
	
	public int getLimInferior() {
		return limInferior;
	}

	public void setLimInferior(int limInferior) {
		this.limInferior = limInferior;
	}

	public int getLimSuperior() {
		return limSuperior;
	}

	public void setLimSuperior(int limSuperior) {
		this.limSuperior = limSuperior;
	}
	
	public void doTheMagic() {
		System.out.println("Limite inferior ao quadrado: " + Math.pow(this.limInferior, 2));
		System.out.println("Limite inferior ao cubo: " + Math.pow(this.limInferior, 3));
		
		System.out.println("Limite superior ao quadrado: " + Math.pow(this.limSuperior, 2));
		System.out.println("Limite superior ao cubo: " + Math.pow(this.limSuperior, 3));
		
		if ((this.limInferior > 100) || (this.limSuperior < this.limInferior)) {
			System.out.println("Mensagem de erro");
		}
	}

	public static void main(String[] args) {
		DoisPontoDois objDoisPontoDois = new DoisPontoDois();
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 1; i++) {
			
			System.out.println("Entre com um valor para o limite inferior do intervalo");
			objDoisPontoDois.setLimInferior(scanner.nextInt());
			
			System.out.println("Entre com um valor para o limite superior do intervalo");
			objDoisPontoDois.setLimSuperior(scanner.nextInt());
			
			objDoisPontoDois.doTheMagic();
			
			System.out.println("Deseja continuar? (0 - nao / 1 - sim)");
			
			if (scanner.nextInt() == 0)
				i++;
			else
				i--;
		}
	}
}
