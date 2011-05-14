package com.zenorocha.lista5.ex1;

import com.zenorocha.lista5.ex1.Produto;
import com.zenorocha.lista5.ex1.ProdutoDAO;

public class Exemplo {
	
	public void salvarProduto(Produto p, ProdutoDAO dao) throws DAOException {
		try{
            dao.armazenar(p);
        }
        catch (DAOException e) {
            throw e;
        }
	}
}
