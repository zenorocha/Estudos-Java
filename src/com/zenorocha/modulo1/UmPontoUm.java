/*
 * Módulo 1
 * Projeto e Construção de Sistemas
 * Professor: Alexandre Correa
 * 
 * Implementado por Zeno Rocha
 * Em 14/03/2011
 * 
 * 
 * --------------------------------------------------------------------------------------------
 * 
 * Programa 1.1:
 * 
 * 	Sejam três variáveis inteiras (a,b,c), pede-se armazenar a multiplicação destes três valores
 * 	em uma quarta variável (resultado), definindo cada uma das quatro variáveis com o tipo
 * 	inteiro de menor tamanho possível (em bytes) para cada cenário. Imprima o resultado da
 * 	quarta variável. Considere os seguintes casos (valores iniciais para as variáveis a, b, c):
 * 		
 * 		a) 10, 2, 5
 * 		b) 15, 20, 10
 * 		c) 12, 200, 4
 * 		d) 12, 200, 400
 * 		e) 90000, 100, 4000
 * 		f) 90000, 100, 40000
 * 
 * 	Você pode fazer um programa para cada caso ou definir conjuntos de 4 variáveis distintas
 * 	para cada caso em um único programa.
 * 
 */

package com.zenorocha.modulo1;

public class UmPontoUm {
	
	private byte vectorA[] = new byte[3];
	private byte resultadoA;
	
	private short vectorB[] = new short[3];
	private short resultadoB;
	
	private short vectorC[] = new short[3];
	private short resultadoC;
	
	private int vectorD[] = new int[3];
	private int resultadoD;
	
	private long vectorE[] = new long[3];
	private long resultadoE;
	
	private long vectorF[] = new long[3];
	private long resultadoF;
	
	public UmPontoUm(){
		
	}
	
	public long[] getVectorF() {
		return vectorF;
	}

	public void setVectorF(long[] vectorF) {
		this.vectorF = vectorF;
	}

	public long getResultadoF() {
		return resultadoF;
	}

	public void setResultadoF(long resultadoF) {
		this.resultadoF = resultadoF;
	}

	public int[] getVectorD() {
		return vectorD;
	}

	public void setVectorD(int[] vectorD) {
		this.vectorD = vectorD;
	}

	public int getResultadoD() {
		return resultadoD;
	}

	public void setResultadoD(int resultadoD) {
		this.resultadoD = resultadoD;
	}

	public short[] getVectorC() {
		return vectorC;
	}

	public void setVectorC(short[] vectorC) {
		this.vectorC = vectorC;
	}

	public short getResultadoC() {
		return resultadoC;
	}

	public void setResultadoC(short resultadoC) {
		this.resultadoC = resultadoC;
	}
	
	public byte[] getVectorA() {
		return vectorA;
	}

	public short[] getVectorB() {
		return vectorB;
	}

	public void setVectorB(short[] vectorB) {
		this.vectorB = vectorB;
	}

	public short getResultadoB() {
		return resultadoB;
	}

	public void setResultadoB(short resultadoB) {
		this.resultadoB = resultadoB;
	}

	public void setVectorA(byte[] vectorA) {
		this.vectorA = vectorA;
	}
	
	public int getResultadoA() {
		return resultadoA;
	}

	public void setResultadoA(byte resultadoA) {
		this.resultadoA = resultadoA;
	}
	
	public long[] getVectorE() {
		return vectorE;
	}

	public void setVectorE(long[] vectorE) {
		this.vectorE = vectorE;
	}

	public long getResultadoE() {
		return resultadoE;
	}

	public void setResultadoE(long resultadoE) {
		this.resultadoE = resultadoE;
	}
	
	public byte calculaResultadoA() {
		return resultadoA = (byte) (vectorA[0] * vectorA[1] * vectorA[2]);
	}
	
	public short calculaResultadoB() {
		return resultadoB = (short) (vectorB[0] * vectorB[1] * vectorB[2]);
	}
	
	public short calculaResultadoC() {
		return resultadoC = (short) (vectorC[0] * vectorC[1] * vectorC[2]);
	}
	
	public int calculaResultadoD() {
		return resultadoD = vectorD[0] * vectorD[1] * vectorD[2];
	}
	
	public long calculaResultadoE() {
		return resultadoE = vectorE[0] * vectorE[1] * vectorE[2];
	}
	
	public long calculaResultadoF() {
		return resultadoF = vectorF[0] * vectorF[1] * vectorF[2];
	}

	public static void main(String[] args) {
		UmPontoUm objUmPontoUm = new UmPontoUm();
		
		byte auxVectorA[] = new byte[3];
		
		auxVectorA[0] = 10;
		auxVectorA[1] = 2;
		auxVectorA[2] = 5;
		
		objUmPontoUm.setVectorA(auxVectorA);
		
		System.out.println(objUmPontoUm.calculaResultadoA());
		
		//////////////////////////
		
		short auxVectorB[] = new short[3];
		
		auxVectorB[0] = 15;
		auxVectorB[1] = 20;
		auxVectorB[2] = 10;
		
		objUmPontoUm.setVectorB(auxVectorB);
		
		System.out.println(objUmPontoUm.calculaResultadoB());
		
		//////////////////////////
		
		short auxVectorC[] = new short[3];
		
		auxVectorC[0] = 12;
		auxVectorC[1] = 200;
		auxVectorC[2] = 4;
		
		objUmPontoUm.setVectorC(auxVectorC);
		
		System.out.println(objUmPontoUm.calculaResultadoC());
		
		//////////////////////////
		
		int auxVectorD[] = new int[3];
		
		auxVectorD[0] = 12;
		auxVectorD[1] = 200;
		auxVectorD[2] = 400;
		
		objUmPontoUm.setVectorD(auxVectorD);
		
		System.out.println(objUmPontoUm.calculaResultadoD());
		
	//////////////////////////
		
		long auxVectorE[] = new long[3];
		
		auxVectorE[0] = 90000;
		auxVectorE[1] = 100;
		auxVectorE[2] = 4000;
		
		objUmPontoUm.setVectorE(auxVectorE);
		
		System.out.println(objUmPontoUm.calculaResultadoE());
		
		//////////////////////////
		
		long auxVectorF[] = new long[3];
		
		auxVectorF[0] = 90000;
		auxVectorF[1] = 100;
		auxVectorF[2] = 40000;
		
		objUmPontoUm.setVectorF(auxVectorF);
		
		System.out.println(objUmPontoUm.calculaResultadoF());
		
	}
	
}


