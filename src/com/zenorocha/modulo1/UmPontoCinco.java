/*
 * Modulo 1
 * Projeto e Construcao de Sistemas
 * Professor: Alexandre Correa
 * 
 * Implementado por Zeno Rocha
 * Em 17/03/2011
 * 
 * --------------------------------------------------------------------------------------------
 * 
 * Programa 1.5
 * 
 *	Suponha que os ganhos de João somem em um ano 87562.34, e que ele tenha que pagar
 *	35% de imposto. Escreva um programa que imprima a seguinte informação:
 *	O imposto a pagar é de <x> reais e <y> centavos.
 * 
 */

package com.zenorocha.modulo1;

public class UmPontoCinco {
	private double ganhoAnual;
	private float imposto;
	
	public UmPontoCinco() {
		
	}
	
	public double getGanhoAnual() {
		return ganhoAnual;
	}
	public void setGanhoAnual(double ganhoAnual) {
		this.ganhoAnual = ganhoAnual;
	}
	public float getImposto() {
		return imposto;
	}
	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	public void calculaImposto() {
		
		double resultado = (ganhoAnual * imposto); 
		//System.out.println(resultado);
		
		String reais;
		String centavos;
		
		String aux = Double.toString(resultado);
		
		reais = aux.substring(0, aux.indexOf("."));
		
		centavos = aux.substring(aux.indexOf(".") + 1);
		centavos = centavos.substring(0, 2);
		
		System.out.println("O imposto a pagar é de " + reais + " reais e " + centavos + " centavos.");	
	}
	
	public static void main(String[] args) {
		UmPontoCinco objUmPontoCinco = new UmPontoCinco();
		
		objUmPontoCinco.setGanhoAnual(87562.34);
		objUmPontoCinco.setImposto(0.35f);
		
		objUmPontoCinco.calculaImposto();
	}
	
}
