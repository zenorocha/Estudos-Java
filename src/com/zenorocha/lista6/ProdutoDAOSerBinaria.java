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
 *      serialização binária (classe ProdutoDAOSerBinaria).
 *
 */

package com.zenorocha.lista6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ProdutoDAOSerBinaria implements ProdutosDAO {

    @Override
    public void salvaLista(ArrayList<Produto> p) {

        System.out.println("entrei aqui");

        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("produtoDAO.dat"));
            output.writeObject(p);
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }

        throw new UnsupportedOperationException("Not supported yet.");
    }

}
