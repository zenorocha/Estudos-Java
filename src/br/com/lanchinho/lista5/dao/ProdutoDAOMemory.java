/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lanchinho.lista5.dao;


import java.sql.SQLException;
import negocio.Produto;

/**
 *
 * @author LABCCET
 */
public class ProdutoDAOMemory implements ProdutoDAO {
    private static final int CAPACIDADE_MAXIMA = 1000;

    private Produto[] produtos = new Produto[CAPACIDADE_MAXIMA];
    private int numProdutos = 0; 

    public void armazenar(Produto p) throws DAOException,SQLException{
        if (numProdutos == CAPACIDADE_MAXIMA)
            throw new DAOException("Não há mais espaço para armazenar produtos");
        if(numProdutos == CAPACIDADE_MAXIMA)
            throw new SQLException();

        int i;
        for (i = 0; i < numProdutos; i++)
            if (produtos[i].getCodigo().equals(p.getCodigo()))
                produtos[i] = p;


        if (i == numProdutos)
            produtos[i] = p;

        numProdutos++;
    }

    public Produto recuperar(String codigoProduto) throws DAOException {
        for(int i = 0; i < numProdutos; i++)
             if (produtos[i].getCodigo().equals(codigoProduto))
                 return produtos[i];
        
        throw new DAOException("Produto Inexistente");
    }
    
    
}

