package com.zenorocha.modulo4;

public class EmpregadoHorista extends Empregado {
    private String nome;
    private float valorHora;
    private int numHoras;
    private final int taxaFixa = 100;

    public EmpregadoHorista(String nome, float valorHora, int numHoras) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.numHoras = numHoras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public void pagamentoLiquido() {
        float salario = (this.getValorHora() * this.getNumHoras()) - this.taxaFixa;
        System.out.println(salario);
    }

    /*public static void main(String[] args) {
        System.out.println("teste");

        EmpregadoHorista emp = new EmpregadoHorista("Joao Roberto", 10, 30);
        emp.aReceberLiquido();
        
    }*/
}
