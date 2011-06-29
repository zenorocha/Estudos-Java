/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio02.banco.ui;

import Exercicio02.banco.negocio.BancoAppException;
import Exercicio02.banco.negocio.Conta;
import java.util.*;

/**
 *
 * @author Guilherme
 */
public class BancoUI {

    private Conta c1;

    public BancoUI(String numero, double saldo) {
        c1 = new Conta(numero, saldo);
    }

    public BancoUI() {
    }

    public Conta criaConta(String numero, double saldo, Conta c1) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o numero da conta");
        numero = scan.nextLine();
        System.out.println("Entre com o saldo");
        saldo = scan.nextDouble();
        c1 = new Conta(numero, saldo);
        return c1;
    }

    public void Menu(Conta c1/*, double saldo*/) {

        String valor;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Selecione:");
            System.out.println("1. Creditar Conta");
            System.out.println("2. Debitar Conta");
            System.out.println("3. Consular Saldo");
            System.out.println("4.Finalizar Programa");
            System.out.println("Sua Escolha:");
            int escolha = scan.nextInt();



            switch (escolha) {
                case 1:
                    try {
                        System.out.println("Entre com o valor a ser creditado");
                        valor = scan.next();
                        c1.creditar(Double.parseDouble(valor));
                    } catch (NumberFormatException e) {
                        System.out.println("Porra Manolo, Colabore");
                    } catch (BancoAppException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        System.out.println("Entre com o valor a ser debitado");
                        valor = scan.next();
                        c1.debitar(Double.parseDouble(valor));
                    } catch (NumberFormatException e) {
                        System.out.println("Porra Manolo, Colabore");
                    } catch (BancoAppException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Saldo: " + c1.getSaldo());
                    break;
                case 4:
                    return;
            }
        }
    }
}
