/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio07;

/**
 *
 * @author Guilherme
 */
public class Produto implements Comparable <Produto> {

    private String nome;
    private int codigo;
    private double preco;

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

    public Produto(String nome, int codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    @Override
    public int hashCode() {
        return 13 * codigo + nome.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Produto outro = (Produto) obj;
        return codigo == outro.codigo && preco == outro.preco && nome.equals(outro.nome);
    }

    public int compareTo(Produto p) {
       int cmpCod = codigo - p.codigo;
       if(cmpCod == 0)
           return nome.compareTo(p.nome);
       else
           return cmpCod;
    }

}
