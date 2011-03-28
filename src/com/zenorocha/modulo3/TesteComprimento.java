/*
 * Módulo 3
 * Projeto e Construção de Sistemas
 * Professor: Alexandre Correa
 * 
 * Implementado por Zeno Rocha
 * Em 21/03/2011
 * 
 * --------------------------------------------------------------------------------------------
 * 
 * Auxilia na execução dos programas Comprimento_01 e Comprimento_02.
 * 
 * Para mais informações, checar cabeçalho dos programas citados acima.
 * 
 */

package com.zenorocha.modulo3;

public class TesteComprimento {
	
	public TesteComprimento() {
		
	}
	
	public static void main(String[] args) {
		/*Comprimento_01 a = new Comprimento_01(2, 4, 6);
		Comprimento_01 b = new Comprimento_01(1, 2, 3);
		
		Comprimento_01 c = new Comprimento_01();
		//a.Dividir(2);
		//c = c.Subtrair(a, b);
		
		a.Print();*/
		
		TesteComprimento teste = new TesteComprimento();
		
		teste.testeConstrutorMCM();
		teste.testeContrutorM();
		teste.testeConstrutorCM();
		teste.testeValorMilimetros();
		teste.testeValorMetros();
		teste.testeSoma();
		teste.testeSubtracao();
		teste.testeMultiplicacao();
		teste.testeDivisao();
		
	}

	// a)
	public void testeConstrutorMCM() {
		Comprimento_01 a = new Comprimento_01(5, 10, 2);
		a.Print();
	}
	
	// b)
	public void testeContrutorM() {
		Comprimento_01 a = new Comprimento_01(5102);
		a.Print();
	}
	
	// c)
	public void testeConstrutorCM() {
		Comprimento_01 a = new Comprimento_01(10 , 50);
		a.Print();
	}
	
	// d)
	public void testeValorMilimetros() {
		Comprimento_01 a = new Comprimento_01(1, 2, 3);
		System.out.println("Valor Milímetros: " + a.getMm());
	}
	
	
	// e)
	public void testeValorMetros() {
		Comprimento_01 a = new Comprimento_01(1, 2, 3);
		System.out.println("Valor Metros: " + a.getM());
	}
	
	// f)
	public void testeSoma() {
		Comprimento_01 a = new Comprimento_01(2, 4, 6);
		Comprimento_01 b = new Comprimento_01(1, 2, 3);
		
		Comprimento_01 c = new Comprimento_01();
		
		c = c.Somar(a, b);
		c.Print();
	}
	
	// g)
	public void testeSubtracao() {
		Comprimento_01 a = new Comprimento_01(2, 4, 6);
		Comprimento_01 b = new Comprimento_01(1, 2, 3);
		
		Comprimento_01 c = new Comprimento_01();
		
		c = c.Subtrair(a, b);
		c.Print();
	}
	
	// h)
	public void testeMultiplicacao() {
		Comprimento_01 a = new Comprimento_01(2, 4, 6);
		
		a.Multiplicar(2);
		a.Print();
	}
	
	// i)
	public void testeDivisao() {
		Comprimento_01 a = new Comprimento_01(2, 4, 6);
		
		a.Dividir(2);
		a.Print();
	}
}
