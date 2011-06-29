/*
 * Lista 6
 * Projeto e Construção de Sistemas
 * Professor: Alexandre Correa
 *
 * Implementado por Zeno Rocha
 * Em 29/06/2011
 *
 * --------------------------------------------------------------------------------------------
 *
 * Exercício 11
 *
 *	Faça um programa que leia um arquivo (TEMPOS.TXT) com os tempos (em segundos)
 *      de cada piloto em cada volta de uma corrida e imprima em um arquivo texto
 *      (RESULTADO.TXT) com os seguintes resultados:
 *
 *          a) o melhor tempo da prova, a volta em que ocorreu e quem fez esse tempo.
 *          b) para cada piloto, o seu melhor tempo e a volta em que ocorreu.
 *          c) para cada piloto, o seu pior tempo e a volta em que ocorreu.
 *          d) para cada piloto, o tempo médio por volta.
 *
 *      Formato do Arquivo:
 *      #PILOTOS: 3
 *      #VOLTAS: 5
 *      FELIPE MASSA
 *      93.503
 *      93.705
 *      94.805
 *      93.430
 *      93.520
 *      LEWIS HAMILTON
 *      93.403
 *      93.805
 *      93.935
 *      93.435
 *      93.330
 *      JENSON BUTTON
 *      93.333
 *      93.735
 *      94.325
 *      93.230
 *      93.320
 *
 *      A primeira linha corresponde ao número de pilotos, a segunda linha o número de voltas
 *      cronometradas para cada piloto e a seguir os tempos para cada piloto, cada linha
 *      corresponde ao tempo em uma volta (iniciando pela volta 1).
 *
 */

package com.zenorocha.lista6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Exercicio12 {

    public static void main(String args[]) {

        BufferedReader leitor = null;
        PrintWriter escritor = null;

        try {
            
            ArrayList<String> linha = new ArrayList();
            leitor = new BufferedReader(new FileReader("tempos.txt"));

            while(leitor.ready()) {
                linha.add(leitor.readLine());
            }

            int numPilotos = Integer.parseInt(linha.get(0).substring(linha.get(0).length() - 1));
            int numVoltas = Integer.parseInt(linha.get(1).substring(linha.get(1).length() - 1));
            
            /*System.out.println(numPilotos);
            System.out.println(numVoltas);*/

            ArrayList<String> pilotos = new ArrayList();

            for (int i = 0; i < numPilotos; i++) {
                pilotos.add(linha.get(2 + (i * (numVoltas + 1))));
            }
            
            //for (int i = 0; i <)

            escritor = new PrintWriter(new FileWriter("resultado.txt"));

            escritor.write("a) o melhor tempo da prova, a volta em que ocorreu e quem fez esse tempo.");
            escritor.write("Resposta: ");

            escritor.write("b) para cada piloto, o seu melhor tempo e a volta em que ocorreu.");
            escritor.write("Resposta: ");

            escritor.write("c) para cada piloto, o seu pior tempo e a volta em que ocorreu.");
            escritor.write("Resposta: ");

            escritor.write("d) para cada piloto, o tempo médio por volta.");
            escritor.write("Resposta: ");
            
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }





    }

}
