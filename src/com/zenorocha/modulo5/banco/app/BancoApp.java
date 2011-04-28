/*
 * Módulo 5
 * Projeto e Construção de Sistemas
 * Professor: Alexandre Correa
 * 
 * Implementado por Zeno Rocha
 * Em 03/04/2011
 * 
 * --------------------------------------------------------------------------------------------
 * 
 * Passo 3: Construir a classe BancoApp (classe com main do programa)
 * 
 * 	Crie uma terceira classe BancoApp que conterá apenas a operação main e a instanciação e
 * 	execução de BancoUI.
 * 
 * 	ATENÇÃO: Defina a classe BancoApp no pacote banco.app.
 * 
 */

package com.zenorocha.modulo5.banco.app;

import com.zenorocha.modulo5.banco.ui.BancoUI;

public class BancoApp {
	public static void main(String[] args) {
		BancoUI bancoUI = new BancoUI();
		bancoUI.start();
	}
}
