/*
 * Lista 2
 * Projeto e Construção de Sistemas
 * Professor: Alexandre Correa
 * 
 * Implementado por Zeno Rocha
 * Em 30/04/2011
 * 
 * --------------------------------------------------------------------------------------------
 * 
 * Exercício 4
 * 
 * 	Escreva um programa que, a partir de um nome informado pelo usuário, imprima suas iniciais.
 * 
 * 	As iniciais são formadas pela primeira letra de cada nome, sendo que todas deverão
 * 	aparecer em maiúsculas no relatório de saída. Note que os conectores e, do, da, dos, das,
 * 	de, di, du não são considerados nomes e, portanto, não devem ser considerados para a
 * 	obtenção das iniciais. As iniciais devem ser impressas em maiúsculas, ainda que o nome
 * 	seja entrado todo em minúsculas.
 * 
 * 	Exemplos:
 * 
 * 		 Maria das Graças Pimenta => MGP
 * 		 João Carlos dos Santos => JCS
 * 		 José da Silva => JS
 * 		 Pedro Pereira Teixeira => PPT
 * 
 */

package com.zenorocha.lista2;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		String[] conectores = {"e", "do", "da", "dos", "das", "de", "di", "du"};

                Scanner scanner = new Scanner(System.in);
                String nome = "";

                System.out.print("Entre com um nome: ");
                nome = scanner.next();

                boolean contemConector = false;

                for (int i = 0; i < conectores.length; i++) {
                    if (nome.contains(conectores[i])) {
                        contemConector = true;
                    }
		}
                
                String iniciais = "";

                if (!contemConector) {

                    iniciais = nome.substring(0, 1);

                    for (int j = 0; j < nome.length(); j++) {
                        int oc = nome.indexOf(" ", 1);
                        iniciais = nome.substring(oc, oc + 1);
                    }
                }
                else {

                }

                System.out.print("Iniciais = " + iniciais);

	}
}
