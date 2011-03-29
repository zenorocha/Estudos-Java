package com.zenorocha.modulo4;

public class EmpregadoAssalariado extends Empregado {
    private String nome;
    private float salarioBase;
    private float descontoPercent;

    public EmpregadoAssalariado(String nome, float salarioBase, float descontoPercent) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.descontoPercent = descontoPercent;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getDescontoPercent() {
        return descontoPercent;
    }

    public void setDescontoPercent(float descontoPercent) {
        this.descontoPercent = descontoPercent;
    }
    
    public void pagamentoLiquido() {
        float salario = this.salarioBase * (1 - this.descontoPercent);
        System.out.println(salario);
    }
    

    /*public static void main(String[] args) {
        System.out.println("teste");

        EmpregadoAssalariado emp = new EmpregadoAssalariado("Joao Roberto", 1000, 0.3f);
        emp.aReceberLiquido();
    }*/
}
