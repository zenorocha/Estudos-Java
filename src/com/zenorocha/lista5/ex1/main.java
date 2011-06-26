/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenorocha.lista5.ex1;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arruda
 */
public class main {
    
        public static void main(String args[]){
            Exemplo e = new Exemplo();
            Produto p = new Produto("1", "nome", 10);
            ProdutoDAOMemory dao = new ProdutoDAOMemory();
            
            //letra A   
            try {                
                e.salvarProdutoA(p, dao);
            } catch (DAOException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //letra B  
            try {                
                e.salvarProdutoB(p, dao);
            } catch (DAOException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //letra C
                e.salvarProdutoC(p, dao);
                
             /*
              * A letra D está comentada pq o metodo armazenar nao joga uma sql execption
              * mas se ele jogasse era so descomentar.
              */
            //letra D
                
//            try {
//                e.salvarProdutoD(p, dao);
//            } catch (SQLException ex) {
//                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
//            }
        
    }
}
