/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LABCCET
 */
public class Exercicio07 {

    public static void main(String[] args) throws ClassNotFoundException {
        ObjectInputStream istream = null;
        Produto[] p;

        try {
            istream = new ObjectInputStream(new FileInputStream("produtos.dat"));
            p = (Produto[]) istream.readObject();
            
            System.out.println(p[0].getCodigo() + " - " + p[0].getNome() + " - " + p[0].getPreco());
//            try {
//                p = (Produto[]) istream.readObject();
//
//                System.out.println(p[0].getCodigo() + " - " + p[0].getNome() + " - " + p[0].getPreco());
//
//            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(Exercicio07.class.getName()).log(Level.SEVERE, null, ex);
//            }
            istream.close();
        } catch (IOException e) {
            System.out.println("DEU CAGADA");

        }
    }
}
