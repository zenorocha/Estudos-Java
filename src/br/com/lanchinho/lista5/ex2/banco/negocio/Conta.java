/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio02.banco.negocio;

/**
 *
 * @author Guilherme
 */
public class Conta {

    private String numero;
    private double saldo;

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double debitar(double valor) throws BancoAppException {

        double saldoAtual = this.saldo;

        if (valor < 0) {
            throw new BancoAppException("Valor a ser debitado tem que ser positivo");
        }
        if (saldoAtual - valor < 0) {
            throw new BancoAppException("Saldo insuficiente");
        }
        if (valor > 2000.00) {
            throw new BancoAppException("Limite para valor a ser debitado excedido ! ");
        }

        this.saldo = saldoAtual - valor;

        return this.saldo;
    }

    public double creditar(double valor) throws BancoAppException {
        double saldoAtual = this.saldo;

        if (valor < 0) {
            throw new BancoAppException("Valor a ser creditado tem que ser positivo");
        }

        this.saldo = saldoAtual + valor;

        return this.saldo;
    }
}
