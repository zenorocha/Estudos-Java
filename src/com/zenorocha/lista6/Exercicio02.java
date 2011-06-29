/*
 * Lista 6
 * Projeto e Construção de Sistemas
 * Professor: Alexandre Correa
 *
 * Implementado por Zeno Rocha
 * Em 28/06/2011
 *
 * --------------------------------------------------------------------------------------------
 *
 * Exercício 2
 *
 *	Faça um programa que leia um texto, entrado linha a linha pelo usuário e grave o
 *      conteúdo em um arquivo texto.txt.
 *
 *      Exemplo de interação com o usuário:
 *
 *      Entre o texto:
 *      Aakdfjkasdjfkasdjfaksdjfaksdlçfjç
 *
 *      Entre o texto:
 *      Asklfjakldfjasdklçjfasdklçjf asdfj askdjfkl askldfjklasjdfça
 *
 *      Entre o texto:
 *      <enter>
 *
 *      Arquivo texto.txt gravado com sucesso
 *      Conteúdo do arquivo texto.txt:
 *      Aakdfjkasdjfkasdjfaksdjfaksdlçfjç
 *      Asklfjakldfjasdklçjfasdklçjf asdfj askdjfkl askldfjklasjdfça
 *
 */

package com.zenorocha.lista6;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String args[]) {
//wtf?! string?!
//        Scanner input = new Scanner("System.in");
        Scanner input = new Scanner(System.in);
        Boolean continua = true;

        try {

            PrintWriter writer = new PrintWriter(new FileWriter("exemplo.txt"));
            String texto = "";

            while (continua) {

                System.out.print("Entre o texto: ");
                texto = input.nextLine();

                if (!texto.equals("")) {
                    
                    //writer.println(texto);
                }
                else {
                    continua = false;
                }
            }

            writer.close();

        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
