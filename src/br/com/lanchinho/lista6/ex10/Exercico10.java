
package Exercicio10;

import java.lang.reflect.Method;
import java.util.*;
import Exercicio10.Produto;

/**
 *
 * @author Guilherme
 */
public class Exercico10 {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            boolean pergunta = true;
            String resposta = new String();

            while (pergunta) {
                System.out.println("Entre com a classe que implementa a funcao guardar (ProdutosDAO ou ProdutoDAOXML):");
                resposta = input.nextLine();
                if (resposta.equals("ProdutosDAO") || resposta.equals("ProdutoDAOXML")) {
                    pergunta = false;
                    break;
                }
                System.out.println("A resposta foi incorreta");
            }

            Produto[] produtos = new Produto[4];
            produtos[0] = new Produto(10, "SABAO", 3.00);
            produtos[1] = new Produto(20, "CERVEJA", 4.00);
            produtos[2] = new Produto(30, "ARROZ", 5.00);
            produtos[3] = new Produto(40, "FEIJAO", 5.00);
            
            Object p1 = Class.forName("Exercicio10." +resposta).newInstance();
            Method m = p1.getClass().getDeclaredMethod("salvar", Produto[].class); 
            m.invoke(p1, new Object[]{produtos}); 
            
        } catch (Exception ex) {
            System.out.println("Houve um erro na reflection" + ex);
        }


    }
}
