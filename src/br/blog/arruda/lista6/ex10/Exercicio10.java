package br.blog.arruda.lista6.ex10;

import br.blog.arruda.lista6.ex6.*;
import java.util.ArrayList;

public class Exercicio10 {

    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
        for (int i = 0; i < 3; i++) {
            Produto p = new Produto("nome " + i + 1, i + 1, new Double(i + 1 * 100));
            listaProdutos.add(p);
        }



    }
}