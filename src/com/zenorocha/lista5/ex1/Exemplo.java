package com.zenorocha.lista5.ex1;

//Estão no mesmo package,desnecessario fazer import.

import java.sql.SQLException;

//import com.zenorocha.lista5.ex1.Produto;
//import com.zenorocha.lista5.ex1.ProdutoDAO;

public class Exemplo {
	
	public void salvarProduto(Produto p, ProdutoDAO dao) throws DAOException {
		try{
            dao.armazenar(p);
        }
        catch (DAOException e) {
            throw e;
        }
	}
        
        //letra A
	public void salvarProdutoA(Produto p, ProdutoDAO dao) throws DAOException {
            dao.armazenar(p);
	}
        //letra B
	public void salvarProdutoB(Produto p, ProdutoDAO dao) throws DAOException {
            try{
            dao.armazenar(p);
                
            }catch(DAOException e){        
                System.out.println("erro ao tentar armazenar o produto");
                throw e;                
            }
                    
	}
        //letra C
	public void salvarProdutoC(Produto p, ProdutoDAO dao) {
            try{
            dao.armazenar(p);
                
            }catch(DAOException e){        
                System.out.println("erro ao tentar armazenar o produto:"+p.getCodigo());
            }                    
            
	}
        
        //letra D
//	public void salvarProdutoD(Produto p, ProdutoDAO dao) throws SQLException{
//            try{
//            dao.armazenar(p);
//                
//            }catch(DAOException e){        
//                System.out.println("erro ao tentar armazenar o produto");
//            }catch(SQLException se){        
//                System.out.println("“erro no acesso ao banco de dado");
//                throw se;
//            }
//                    
//	}
        
        
        
}
