/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.blog.arruda.lista6.ex10.DAO;

import br.blog.arruda.lista6.ex6.Produto;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author arruda
 */
public class ProdutoDAOSerBinaria implements ProdutoDAO {

    @Override
    public boolean armazena(ArrayList<Produto> listaProdutos) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("produtos"));

            oos.writeObject(listaProdutos);
            oos.close();

        }catch(IOException e){
            return false;
        }
        return true;
    }
}
