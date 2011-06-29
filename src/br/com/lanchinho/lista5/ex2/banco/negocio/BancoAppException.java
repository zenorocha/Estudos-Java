/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio02.banco.negocio;

/**
 *
 * @author Guilherme
 */
public class BancoAppException extends Exception {
    BancoAppException(){
        
    }
    BancoAppException(String msg){
        super(msg);
    }
    
}
