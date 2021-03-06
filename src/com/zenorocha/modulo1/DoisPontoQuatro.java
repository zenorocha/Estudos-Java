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
 * Programa 2.4
 * 
 *	Faça uma versão do programa 2.2 com o comando do while.
 * 
 */

package com.zenorocha.modulo1;

import java.util.Scanner;

public class DoisPontoQuatro {
	private int limInferior;
	private int limSuperior;
	
	public DoisPontoQuatro() {
		
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
		DoisPontoQuatro objDoisPontoQuatro = new DoisPontoQuatro();
		Scanner scanner = new Scanner(System.in);
		
		int resposta = 1;
		
		do {
			
			System.out.println("Entre com um valor para o limite inferior do intervalo");
			objDoisPontoQuatro.setLimInferior(scanner.nextInt());
			
			System.out.println("Entre com um valor para o limite superior do intervalo");
			objDoisPontoQuatro.setLimSuperior(scanner.nextInt());
			
			objDoisPontoQuatro.doTheMagic();
			
			System.out.println("Deseja continuar? (0 - nao / 1 - sim)");
			
			if (scanner.nextInt() == 0)
				break;
			else
				continue;
		} while (resposta == 1);
	}
}
