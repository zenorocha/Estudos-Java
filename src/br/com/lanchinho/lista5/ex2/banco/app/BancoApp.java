/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio02.banco.app;

import Exercicio02.banco.ui.BancoUI;

/**
 *
 * @author Guilherme
 */
public class BancoApp {

    public static void main(String[] args) {
        BancoUI B1 = new BancoUI();
        String numero = "";
        double saldo = 0.0;
        
        B1.Menu(B1.criaConta(numero, saldo, null)/*, saldo*/);    
    }
}