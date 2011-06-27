/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.blog.arruda.lista6.ex10.DAO;

import br.blog.arruda.lista6.ex6.Produto;
import java.util.ArrayList;

/**
 *
 * @author arruda
 */
public interface ProdutoDAO {
    public boolean armazena(ArrayList<Produto> listaProdutos);
    
}
