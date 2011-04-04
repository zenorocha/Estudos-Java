/*
 * Modulo 3
 * Projeto e Construcao de Sistemas
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

package com.zenorocha.modulo6;

public class TesteComprimento {
	
	public TesteComprimento() {
		
	}
	
	public static void main(String[] args) {
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
		
		Comprimento_02 b = new Comprimento_02(5, 10, 2);
		b.Print();
	}
	
	// b)
	public void testeContrutorM() {
		Comprimento_01 a = new Comprimento_01(5102);
		a.Print();
		
		Comprimento_02 b = new Comprimento_02(5102);
		b.Print();
	}
	
	// c)
	public void testeConstrutorCM() {
		Comprimento_01 a = new Comprimento_01(10 , 50);
		a.Print();
		
		Comprimento_02 b = new Comprimento_02(10 , 50);
		b.Print();
	}
	
	// d)
	public void testeValorMilimetros() {
		Comprimento_01 a = new Comprimento_01(1, 2, 3);
		System.out.println("Valor Milímetros: " + a.getMm());
		
		Comprimento_02 b = new Comprimento_02(1, 2, 3);
		System.out.println("Valor Milímetros: " + b.getMm());
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
		
		///
		
		Comprimento_02 x = new Comprimento_02(2);
		Comprimento_02 y = new Comprimento_02(1);
		
		Comprimento_02 z = new Comprimento_02();
		
		z = z.Somar(x, y);
		z.Print();
	}
	
	// g)
	public void testeSubtracao() {
		Comprimento_01 a = new Comprimento_01(2, 4, 6);
		Comprimento_01 b = new Comprimento_01(1, 2, 3);
		
		Comprimento_01 c = new Comprimento_01();
		
		c = c.Subtrair(a, b);
		c.Print();
		
		///
		
		Comprimento_02 x = new Comprimento_02(2);
		Comprimento_02 y = new Comprimento_02(1);
		
		Comprimento_02 z = new Comprimento_02();
		
		z = z.Subtrair(x, y);
		z.Print();
	}
	
	// h)
	public void testeMultiplicacao() {
		Comprimento_01 a = new Comprimento_01(2, 4, 6);
		
		a.Multiplicar(2);
		a.Print();

		///
		
		Comprimento_02 x = new Comprimento_02(2);
		
		x.Multiplicar(2);
		x.Print();
	}
	
	// i)
	public void testeDivisao() {
		Comprimento_01 a = new Comprimento_01(2, 4, 6);
		
		a.Dividir(2);
		a.Print();

		///
		
		Comprimento_02 x = new Comprimento_02(2);
		
		x.Dividir(2);
		x.Print();
	}
}
