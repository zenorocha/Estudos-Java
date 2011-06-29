/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio10;



import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 *
 * @author Guilherme
 */
public class ProdutoDAOXML implements IProdutoDAO {
public void salvar(Produto[] produtos) {
        XMLEncoder encoder = null;

        try {
            encoder = new XMLEncoder(new FileOutputStream("prodEX10.xml"));
            encoder.writeObject(produtos);
            
            encoder.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro na escrita do arquivo XML: " + e.getMessage());
        }
    }
}


