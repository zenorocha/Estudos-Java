/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lanchinho.lista5.dao;

import java.io.IOException;
import java.sql.SQLException;
import negocio.Produto;

/**
 *
 * @author LABCCET
 */
public interface ProdutoDAO {

    Produto recuperar(String codigoProduto) throws DAOException;
    void armazenar(Produto p) throws DAOException, IOException, SQLException;
}
