/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista6;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Guilherme
 */
public class Exercicio12 {

    public static Piloto[] instanciaPilotos(String nomearquivo) {
        int AGUARDANDO_PILOTOS = 0;
        int AGUARDANDO_VOLTAS = 1;
        int LENDO_NOME = 2;
        int LENDO_VOLTAS = 3;

        int qtdeVoltas = 0;
        int qtdePilotos = 0;
        Piloto[] pilotos = null;
        try {
            BufferedReader arquivo = new BufferedReader(
                    new FileReader(nomearquivo), 32000);

            double[] voltas = null;
            String nomePiloto = null;
            int contadorVoltas = 0;
            int indicePilotos = 0;
            String linha = null;
            int ESTADO_ATUAL = AGUARDANDO_PILOTOS;
            while (arquivo.ready()) {
                linha = arquivo.readLine();
                if (ESTADO_ATUAL == AGUARDANDO_PILOTOS) {
                    qtdePilotos = Integer.valueOf(linha.split(" ")[1]);
                    pilotos = new Piloto[qtdePilotos];
                    ESTADO_ATUAL = AGUARDANDO_VOLTAS;
                } else if (ESTADO_ATUAL == AGUARDANDO_VOLTAS) {
                    qtdeVoltas = Integer.valueOf(linha.split(" ")[1]);
                    ESTADO_ATUAL = LENDO_NOME;
                } else if (ESTADO_ATUAL == LENDO_NOME) {
                    nomePiloto = linha;
                    voltas = new double[qtdeVoltas];
                    ESTADO_ATUAL = LENDO_VOLTAS;
                } else if (ESTADO_ATUAL == LENDO_VOLTAS) {
                    voltas[contadorVoltas] = Double.valueOf(linha);
                    contadorVoltas++;
                    if (contadorVoltas == qtdeVoltas) {
                        pilotos[indicePilotos] = new Piloto(nomePiloto, voltas);
                        contadorVoltas = 0;
                        indicePilotos++;
                        ESTADO_ATUAL = LENDO_NOME;
                    }
                }
            }
            arquivo.close();

        } catch (Exception ex) {
            System.out.println("Não foi possível ler o  arquivo: " + ex.getMessage());
        }
        return pilotos;
    }

    public static void main(String[] args) {
        Piloto[] pilotos = instanciaPilotos("TEMPOS.txt");
        boolean primeiraVolta = true;
        double melhorVolta = 0;
        String donoMelhorVolta = "Ninguem";

        for (Piloto piloto : pilotos) {
            System.out.println("Nome piloto - " + piloto.getName());
            for (int i = 0; i < piloto.getVoltas().length; i++) {
                if (primeiraVolta) {
                    melhorVolta = piloto.getVoltas()[i];
                    donoMelhorVolta = piloto.getName();
                    primeiraVolta = false;
                }
                if (piloto.getVoltas()[i] <= melhorVolta) {
                    melhorVolta = piloto.getVoltas()[i];
                    donoMelhorVolta = piloto.getName();
                }
            }
        }

        System.out.println("Dono melhor volta - " + donoMelhorVolta);
        System.out.println("Tempo melhor volta - " + melhorVolta);
    }
}
