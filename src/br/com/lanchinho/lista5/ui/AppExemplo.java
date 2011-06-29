/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ui;


import dao.DAOException;
import dao.ProdutoDAOMemory;
import java.sql.SQLException;
import java.util.Scanner;
import negocio.Produto;

/**
 *
 * @author LABCCET
 */
public class AppExemplo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str;

        Produto prod1 = new Produto("123","Arroz", 5.40);
        Produto prod2 = new Produto("321","Feijao", 8.70);
        Produto prod3 = new Produto("111", "Farinha", 2.20);
        Produto prod4 = new Produto("321","Panela",15.50);
        Produto prod5;

        ProdutoDAOMemory product = new ProdutoDAOMemory();

        try{

            product.armazenar(prod1);
            product.armazenar(prod2);
            product.armazenar(prod3);
            product.armazenar(prod4);
        
        } catch(DAOException e){

            System.out.println(e.getMessage());

        } catch (SQLException sql){
        
            System.out.println("Erro no BD");
        }// catch(IOException i) System.out.println(i.getMessage());

        try{

            System.out.println("Digite o codigo do produto:");
            str = scan.next();
            
            prod5 = product.recuperar(str);
            
            System.out.println("Nome: " + prod5.getNome());
            System.out.println("Nome: " + prod5.getCodigo());
            System.out.println("Nome: " + prod5.getPrecoUnitario());

        } catch(DAOException e) {

            System.out.println(e.getMessage());

        }

    }

}
