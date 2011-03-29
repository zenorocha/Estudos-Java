package com.zenorocha.modulo4;

public class FolhaPagamento {

    private Empregado[] vetorEmpregados;
    
    public FolhaPagamento() {
    	vetorEmpregados = new Empregado[9];
    }
    
    public Empregado[] getVetorEmpregados() {
    	return this.vetorEmpregados;
    }
    
    public Empregado getVetorEmpregados(int indice) {
    	return this.vetorEmpregados[indice];
    }
    
    public void setVetorEmpregados(int indice, Empregado empregado) {
    	this.vetorEmpregados[indice] = empregado;
    }
    
    public void Print() {
    	for (int i = 0; i < this.vetorEmpregados.length; i++) {
    		System.out.println(this.vetorEmpregados[i]);	
    	}
    	
    }
    
    public static void main(String[] args) {
    	
    	EmpregadoAssalariado empregado01 = new EmpregadoAssalariado("Joao", 1000f, 0.07f);
    	EmpregadoAssalariado empregado02 = new EmpregadoAssalariado("Carlos", 2000f, 0.07f);
    	EmpregadoAssalariado empregado03 = new EmpregadoAssalariado("Antonio", 3000f, 0.15f);
    	
    	EmpregadoBonificado empregado04 = new EmpregadoBonificado("Maria", 6000f, 0.27f, 0.1f);
    	EmpregadoBonificado empregado05 = new EmpregadoBonificado("José", 3500f, 0.15f, 0.4f);
    	EmpregadoBonificado empregado06 = new EmpregadoBonificado("Lais", 1435f, 0.24f, 0.05f);
    	
    	EmpregadoHorista empregado07 = new EmpregadoHorista("Juliano", 10, 30);
    	EmpregadoHorista empregado08 = new EmpregadoHorista("Marcos", 50, 20);
    	EmpregadoHorista empregado09 = new EmpregadoHorista("Roberto", 35, 20);
    	
    	FolhaPagamento folhaPagamento = new FolhaPagamento();
    	
    	folhaPagamento.setVetorEmpregados(0, empregado01);
    	folhaPagamento.setVetorEmpregados(1, empregado02);
    	folhaPagamento.setVetorEmpregados(2, empregado03);
    	folhaPagamento.setVetorEmpregados(3, empregado04);
    	folhaPagamento.setVetorEmpregados(4, empregado05);
    	folhaPagamento.setVetorEmpregados(5, empregado06);
    	folhaPagamento.setVetorEmpregados(6, empregado07);
    	folhaPagamento.setVetorEmpregados(7, empregado08);
    	folhaPagamento.setVetorEmpregados(8, empregado09);
    	
    	folhaPagamento.Print();
    	
	}
}
