package com.zenorocha.lista5.ex1;


public class ProdutoDAOMemory implements ProdutoDAO {

	public static final int TOTAL = 1000;
	Produto listaProdutos[] = new Produto[TOTAL];
	int numProdutos = 0;

        public void armazenar(Produto p) throws DAOException {          
                         
                try {

                    for (int i = 0; i <= numProdutos; i++) {
                        try{
                            if(listaProdutos[i].getCodigo().equals(p.getCodigo())){
                                listaProdutos[i] = p;
                                break;
                            }                            
                        }catch(NullPointerException e){                            
                        }

                        if (i == numProdutos) {
                            listaProdutos[i] = p;
                            numProdutos++;
                            break;
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException ae) {
                    throw new DAOException("Limite de produtos atingido.");

                }
        }

	public Produto recuperar(String codigoProduto) throws DAOException {
		
		for (int i = 0; i < numProdutos; i++) {
			
			if (listaProdutos[i].getCodigo().equals(codigoProduto)) {
				return listaProdutos[i];
			}
		}
		
		throw new DAOException("Produto não encontrado.");
	}
	
	
}
