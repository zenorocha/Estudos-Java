package com.zenorocha.modulo4;

/*import sun.font.EAttribute;*/

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LABCCET
 */
public class EmpregadoBonificado {
    private String nome;
    private float salarioBase;
    private float descontoPercent;
    private float bonusPercent;

    public EmpregadoBonificado(String nome, float salarioBase, float descontoPercent, float bonusPercent) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.descontoPercent = descontoPercent;
        this.bonusPercent = bonusPercent;
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

    public void aReceberLiquido() {
        float salario = (this.salarioBase * (1 - this.descontoPercent)) * (1 + this.bonusPercent);
        System.out.println(salario);
    }

    public static void main(String[] args) {
        System.out.println("teste");

        EmpregadoBonificado emp = new EmpregadoBonificado("Joao Roberto", 1000, 0.3f, 0.1f);
        emp.aReceberLiquido();

    }
}
