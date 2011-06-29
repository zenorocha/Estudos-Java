/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio7;

import Exercicio1ao5.*;

/**
 *
 * @author LABCCET
 */
public class ConversorDistancia {

    public static double converteParaMilha(double metro) {

        return metro / 1609;
    }

    public static double converteParaMetro(double milha) {
        return milha * 1609;
    }

    public static double converteMparaJarda(double metro) {
        return metro * 1.094;
    }

    public static double converteJardaparaMetro(double jarda) {
        return jarda * 0.9144;
    }

    public static double converteMilhaparaJarda(double milha) {
        return milha * 1760;
    }

    public static double converteJardaparaMilha(double jarda) {
        return jarda * 0.00057;
    }
}
