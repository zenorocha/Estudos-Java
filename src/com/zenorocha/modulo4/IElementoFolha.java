/*
 * Modulo 3
 * Projeto e Construcao de Sistemas
 * Professor: Alexandre Correa
 * 
 * Implementado por Zeno Rocha
 * Em 30/03/2011
 * 
 * --------------------------------------------------------------------------------------------
 * 
 * Programa Folha de Pagamento – Pessoas e Empresas
 * 
 * 	Gere uma nova versão do programa anterior, considerando o seguinte design: As classes
 * 	Empregado* implementam uma interface IElementoFolha. A interface IElementoFolha
 * 	estende duas interfaces: IPagamento e INome.
 * 	A interface IPagamento possui a seguinte operação:getPagamentoLiquido e getRegime.
 * 		
 * 		• A operação getPagamentoLiquido retorna o pagamento líquido conforme as fórmulas
 * 		de cálculo definidas anteriormente.
 * 		• A operação getTipo retorna o tipo do elemento para impressão na folha (Horista, Assalariado, Bonificado).
 * 
 * 	A interface INome possui a operação getNome.
 * 	Modifique também a classe FolhaPagamento de forma que o array não seja mais da
 * 	superclasse Empregado, mas sim um array de IElementoFolha, ou seja, de objetos que implementem esta interface.
 * 	Uma vez que a nova versão do programa esteja funcionando, agora com interfaces, faça a seguinte extensão:
 * 	Crie uma classe Empresa que também implementará a interface IElementoFolha, com
 * 	nome, um valor bruto, uma taxa de IR e uma taxa de ISS como descontos.
 * 	
 * 	O valor líquido de uma empresa é dado pela seguinte fórmula: Valor Bruto * (1 – taxaIR – taxaISS).
 * 	A implementação da operação getRegime de empresa deverá retornar o string “Pessoa Jurídica”.
 * 
 * 	Modifique a classe FolhaPagamento de forma a imprimir uma relação de pagamentos a
 * 	serem efetuados, considerando horistas, assalariados, bonificados e empresas. Para tal,
 * 	inicialize o vetor de elementos do tipo IElementoFolha definido em FolhaPagamento para
 * 	que tenha 3 elementos de cada tipo, ou seja, 3 horistas, 3 assalariados, 3 bonificados e 3 empresas.
 * 
 */

package com.zenorocha.modulo4;

public interface IElementoFolha extends INome, IPagamento {

}
