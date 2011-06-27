/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.blog.arruda.lista6.ex10.DAO;

import br.blog.arruda.lista6.ex6.Produto;
import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arruda
 */
public class ProdutoDAOXML implements ProdutoDAO {

    @Override
    public boolean armazena(ArrayList<Produto> listaProdutos) {

        FileOutputStream os = null;
        try {
            os = new FileOutputStream("produtos.xml");
        } catch (FileNotFoundException ex) {
            return false;
        }
        XMLEncoder encoder = new XMLEncoder(os);

        encoder.writeObject(listaProdutos);
        encoder.close();
        return true;
    }
}
