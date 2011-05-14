package com.zenorocha.lista5.ex1;

import com.zenorocha.lista5.ex1.Produto;

public interface ProdutoDAO {
	void armazenar(Produto p) throws DAOException;
	Produto recuperar(String codigoProduto) throws DAOException;
}
