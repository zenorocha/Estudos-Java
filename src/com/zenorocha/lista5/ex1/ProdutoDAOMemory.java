package com.zenorocha.lista5.ex1;

import com.zenorocha.lista5.ex1.Produto;

public class ProdutoDAOMemory implements ProdutoDAO {

	public static final int TOTAL = 1000;
	Produto listaProdutos[] = new Produto[TOTAL];
	int numProdutos = 0;
	
	public void armazenar(Produto p) throws DAOException {
		
		if (numProdutos != TOTAL) {
			
			for (int i = 0; i < numProdutos; i++) {
				
				if (listaProdutos[i].getCodigo() == p.getCodigo()) {
	            	listaProdutos[i] = p;
	            }
	                
	            if (i == numProdutos) {
	            	listaProdutos[i] = p;
	            }
	            
	            numProdutos++;
			}
		}
		else {
            throw new DAOException("Limite de produtos atingido.");
		}
	}

	public Produto recuperar(String codigoProduto) throws DAOException {
		
		for (int i = 0; i < numProdutos; i++) {
			
			if (listaProdutos[i].getCodigo() != codigoProduto) {
				return listaProdutos[i];
			}
		}
		
		throw new DAOException("Produto não encontrado.");
	}
	
	
}
