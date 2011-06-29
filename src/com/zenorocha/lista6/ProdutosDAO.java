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
 *	- Crie uma interface ProdutosDAO que define uma operação para salvar um array de
 *      objetos da classe Produto.
 *
 */

package com.zenorocha.lista6;

import java.util.ArrayList;

public interface ProdutosDAO {

    public void salvaLista(ArrayList<Produto> p);

}
