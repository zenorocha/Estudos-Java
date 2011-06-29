/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

/**
 *
 * @author LABCCET
 */
public class Produto {
    private String codigo;
    private String nome;
    private double PrecoUnitario;

    public double getPrecoUnitario() {
        return PrecoUnitario;
    }

    public void setPrecoUnitario(double PrecoUnitario) {
        this.PrecoUnitario = PrecoUnitario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Produto(String codigo, String nome, double PrecoUnitario) {
        this.codigo = codigo;
        this.nome = nome;
        this.PrecoUnitario = PrecoUnitario;
    }

    public Produto(){
        
    }

}
