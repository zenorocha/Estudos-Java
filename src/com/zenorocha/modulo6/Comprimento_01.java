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
 * Programa Comprimento_01:
 * 
 * 	Defina uma classe Comprimento com a qual possamos:
 * 
 * 		a) Criar um objeto Comprimento passando três valores (correspondentes a metros, centímetros e milímetros).
 * 		b) Criar um objeto Comprimento passando um valor em milímetros.
 * 		c) Criar um objeto Comprimento passando um valor em centímetros e um valor em milímetros.
 * 		d) Obter uma string com o comprimento em metros, centímetros e milímetros. (Formato do string gerado: “x metros, y centímetros e z milímetros”).
 * 		e) Obter o valor total do comprimento em milímetros (retorna um valor inteiro).
 * 		f) Obter o valor total do comprimento em metros (retorna um valor ponto flutuante).
 * 		g) Somar dois comprimentos gerando um novo objeto comprimento que é a soma dos dois => chamada será Comprimento.somar(a,b)
 * 		h) Subtrair dois comprimentos, gerando um novo objeto comprimento que é a subtração de a por b => chamada será Comprimento.subtrair(a,b)
 * 		i) Multiplicar o comprimento por um valor inteiro (resultado será o objeto comprimento atualizado) => chamada será x.multiplicar(i);
 * 		j) Dividir o comprimento por um valor inteiro => idem à multiplicação.
 * 
 * 	Armazene as informações de um comprimento em três atributos inteiros distintos
 * 	(metros, centímetros, milímetros).
 * 
 * 	Crie um programa para usar a classe Comprimento. Por exemplo, defina uma classe
 * 	TesteComprimento que vai ter uma operação main e algumas operações de teste. A
 * 	operação main apenas chamará as operações de teste em seqüência.
 * 
 * 	Exemplos:
 * 		
 * 		a) testeConstrutorMCM:
 * 			criar um objeto com 5 metros, 10 centímetros e 2 milímetros e imprimir seu valor
 * 			string através de uma chamada à operação obter string (item d da classe Comprimento).
 * 			Você pode experimentar criar outros objetos Comprimento com outros valores para
 * 			metros, centímetros e milímetros para se certificar que o programa está funcionando em outras situações.
 * 
 * 		b) testeContrutorM:
 * 			criar um objeto com 5102 milímetros e imprimir seu valor string através de uma
 * 			chamada à operação obter string (item d da classe Comprimento).
 * 			Você pode experimentar criar outros objetos Comprimento com outros valores para
 * 			milímetros para se certificar que o programa está funcionando em outras situações.
 * 
 * 		c) testeConstrutorCM:
 * 		d) testeValorMilimetros:
 * 		e) testeValorMetros:
 * 		f) testeSoma
 * 		g) testeSubtracao
 * 		h) testeMultiplicacao
 * 		i) testeDivisao
 * 
 */

package com.zenorocha.modulo6;

public class Comprimento_01 {

	private int m; // metros
	private int cm; // centímetros
	private int mm; // milímetros
	
	// default
	public Comprimento_01() {
		
	}
	
	// a)
	public Comprimento_01(int m, int cm, int mm) {
		this.m = m;
		this.cm = cm;
		this.mm = mm;
	}

	// b)
	public Comprimento_01(int mm) {
		this.mm = mm;
	}
	
	// c)
	public Comprimento_01(int cm, int mm) {
		this.cm = cm;
		this.mm = mm;
	}
	
	// d)
	public void Print() {
		System.out.println(this.m + " metros, " + this.cm + " centímetros e " + this.mm + " milímetros");
	}
	
	// g)
	public Comprimento_01 Somar(Comprimento_01 x, Comprimento_01 y) {
		
		Comprimento_01 z = new Comprimento_01();
		
		z.cm = x.cm + y.cm;
		z.m = x.m + y.m;
		z.mm = x.mm + y.mm;
		
		return z;
	}
	
	// h)
	public Comprimento_01 Subtrair(Comprimento_01 x, Comprimento_01 y) {
		
		Comprimento_01 z = new Comprimento_01();
		
		z.cm = x.cm - y.cm;
		z.m = x.m - y.m;
		z.mm = x.mm - y.mm;
		
		return z;
	}
	
	// i)
	public void Multiplicar(int valor) {
		
		this.cm = this.cm * valor;
		this.m = this.m * valor;
		this.mm = this.mm * valor;
	}
	
	// j)
	public void Dividir(int valor) {
		
		this.cm = this.cm / valor;
		this.m = this.m / valor;
		this.mm = this.mm / valor;
	}

	// getters and setters
	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getCm() {
		return cm;
	}

	public void setCm(int cm) {
		this.cm = cm;
	}
	
	// e)
	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}
	
	// f)
	public float getFloatM() {
		return (float)m;
	}
}
