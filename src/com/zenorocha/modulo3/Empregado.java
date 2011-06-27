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
 * Programa Empregado:
 * 	
 * 	Defina uma classe Empregado com os atributos nome, salário base, taxa percentual de
 * 	desconto e altura (comprimento), contendo:
 * 		
 * 		a) construtor default com taxa percentual de desconto = 10%.
 * 		b) construtor com nome, altura, salário e taxa percentual.
 * 		c) métodos get e set para os atributos.
 * 		d) método pagamentoLiquido sendo o resultado do cálculo: salário descontado da taxa percentual.
 * 
 */

package com.zenorocha.modulo3;

public class Empregado {
	private String nome;
	private float salario;
	private float taxaDesconto;
	private float altura;
	
	public Empregado() {
		taxaDesconto = 0.10f;
	}
	
	public Empregado(String nome, float altura, float salario, float taxaDesconto) {
		this.nome = nome;
		this.altura = altura;
		this.salario = salario;
		this.taxaDesconto = taxaDesconto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float getTaxaDesconto() {
		return taxaDesconto;
	}

	public void setTaxaDesconto(float taxaDesconto) {
		this.taxaDesconto = taxaDesconto;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float pagamentoLiquido() {
		return (this.salario - (this.salario * this.taxaDesconto));
	}
	
	public static void main(String[] args) {
		Empregado empregado = new Empregado("Jos�", 1.75f, 1000f, 0.10f);
		System.out.println("O pagamento l�quido desse funcion�rio �: " + empregado.pagamentoLiquido());
	}
	
}
