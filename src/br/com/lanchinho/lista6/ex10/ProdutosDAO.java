/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio10;


import java.io.BufferedOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


/**
 *
 * @author Guilherme
 */
public class ProdutosDAO implements IProdutoDAO {

    public void salvar(Produto[] produtos) {
        ObjectOutputStream ostream = null;
        try {
            ostream = new ObjectOutputStream (new BufferedOutputStream(new FileOutputStream("prodEX10.dat"), 32000));
            ostream.writeObject(produtos);
            
            ostream.close();
        } catch (IOException ex) {
            System.out.println("Ocorreu um erro na escrita do arquivo binario: " + ex.getMessage());
        }
    }
}
