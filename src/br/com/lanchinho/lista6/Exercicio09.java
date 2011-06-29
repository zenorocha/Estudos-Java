/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista6;

import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author LABCCET
 */
public class Exercicio09 {
    public static void main(String[] args) throws ClassNotFoundException {
        XMLDecoder decoder = null;
        ProdutoEspecial[] produtos;

        try {
            decoder = new XMLDecoder(new FileInputStream("produtos.xml"));
            produtos = (ProdutoEspecial[]) decoder.readObject();

            for(ProdutoEspecial p : produtos)
            System.out.println(p.getCodigo() + " - " + p.getNome() + " - " + p.getPreco());

            decoder.close();
        } catch (IOException e) {
            System.out.println("DEU CAGADA");

        }
    }
}
