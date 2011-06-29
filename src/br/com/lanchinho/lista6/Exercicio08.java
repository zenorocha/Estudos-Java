/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lista6;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author LABCCET
 */
public class Exercicio08 {
     public static void main(String[] args) {
        ProdutoEspecial[] p = new ProdutoEspecial[3];
        p[0] = new ProdutoEspecial(10, "CERVEJA", 1.65);
        p[1] = new ProdutoEspecial(11, "HD", 135.00);
        p[2] = new ProdutoEspecial(12, "PENDRIVE", 65.00);

        XMLEncoder encoder = null;
        try {
            encoder = new XMLEncoder(new FileOutputStream("produtos.xml"));
            encoder.writeObject(p);
            encoder.close();

        } catch (IOException e) {
            System.out.println("DEU CAGADA");

        }
    }

}
