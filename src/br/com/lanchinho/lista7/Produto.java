/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista7;

/**
 *
 * @author LABCCET
 */
public class Produto implements Comparable<Produto>{ // comparable e equals  p/ Árvore
    // hashcode e equals pra HashSet

    private int codigo;
    private String nome;
    private double preco;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null) return false;
        if(getClass() !=obj.getClass()) return false;
        Produto outro = (Produto) obj;
        return codigo == outro.codigo && nome.equals(outro.nome);

    }

    @Override
    public int hashCode() {
        return 13 * codigo + 17 * nome.hashCode();
    }

    public int compareTo(Produto o) {
        int cmpCodigo = codigo - o.codigo;
        if(cmpCodigo == 0)
            return nome.compareTo(o.nome);
        else
            return cmpCodigo;

    }



}
