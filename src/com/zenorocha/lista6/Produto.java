/*
 * Lista 6
 * Projeto e Construção de Sistemas
 * Professor: Alexandre Correa
 *
 * Implementado por Zeno Rocha
 * Em 29/06/2011
 *
 * --------------------------------------------------------------------------------------------
 *
 * Exercício 6
 *
 *	Seja uma classe Produto com atributos nome (string), código (int) e preço (double), faça
 *      um programa que instancie alguns produtos (ex: 3 produtos), armazenando suas
 *      referências em um array. Em seguida, armazene os dados desses três produtos em um
 *      arquivo via serialização binária.
 *
 */

package com.zenorocha.lista6;

import java.io.Serializable;

public class Produto implements Serializable {
    private String nome;
    private int codigo;
    private double preco;

    public Produto() {

    }

    public Produto(String nome, int codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}