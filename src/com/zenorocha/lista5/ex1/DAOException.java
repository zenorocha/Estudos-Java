package com.zenorocha.lista5.ex1;

public class DAOException extends Exception {
	
	// Não sei ao certo pra que serve, mas como o Eclipse estava chorando resolvi colocar...
	private static final long serialVersionUID = 1L;

	public DAOException() {
		
	}
	
	public DAOException(String excecao) {
		super(excecao);
	}

}
