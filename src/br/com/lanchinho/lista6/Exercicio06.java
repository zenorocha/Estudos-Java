/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author LABCCET
 */
public class Exercicio06 {

    public static void main(String[] args) {
        Produto[] p = new Produto[3];
        p[0] = new Produto(10, "CERVEJA", 1.65);
        p[1] = new Produto(11, "HD", 135.00);
        p[2] = new Produto(112, "PENDRIVE", 65.00);

        ObjectOutputStream ostream = null;
        try {
            ostream = new ObjectOutputStream(new FileOutputStream("produtos.dat"));
            ostream.writeObject(p);
            ostream.close();

        } catch (IOException e) {
            System.out.println("DEU CAGADA");

        }
    }
}
