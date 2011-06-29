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
public class ConversorTemperatura {
    public static double CelsiusToFahrenheit(double celsius){
        return ((9* celsius) + (5 * 32)) /5;

    }

    public static double FahrenheitToCelsius(double fahrenheit){
        return (5 * (fahrenheit - 32))/9;
    }


}

