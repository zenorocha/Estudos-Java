/*
 * Lista 6
 * Projeto e Construção de Sistemas
 * Professor: Alexandre Correa
 *
 * Implementado por Zeno Rocha
 * Em 29/06/2011
 *
 * --------------------------------------------------------------------------------------------
 *
 * Exercício 10
 *
 *      - Crie uma implementação desta interface que armazene o array em um arquivo via
 *      serialização XML (classe ProdutoDAOXML).
 *
 */

package com.zenorocha.lista6;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ProdutoDAOXML implements ProdutosDAO {

    @Override
    public void salvaLista(ArrayList<Produto> p) {

        try {
            XMLEncoder xml = new XMLEncoder(new FileOutputStream("produtoDAO.xml"));
            xml.writeObject(p);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        throw new UnsupportedOperationException("Not supported yet.");
    }

}
