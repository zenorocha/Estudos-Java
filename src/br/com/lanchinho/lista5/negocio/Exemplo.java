/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dao.DAOException;
import dao.ProdutoDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LABCCET
 */
public class Exemplo {

    public void salvarProduto(Produto p, ProdutoDAO dao)throws DAOException, SQLException {
        try {
            //espera pelo semaforo
            dao.armazenar(p);
            // libera o semaforo
        } catch (DAOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println("ERRO !!!");
            throw new SQLException("Erro fatal no BD");
            //libera o semaforo   
        } catch (Exception ex) {
            Logger.getLogger(Exemplo.class.getName()).log(Level.SEVERE, null, ex);
            //libera o semaforo
        } finally {
            //libera o, a vc sabe quem ...
        }



    }
}
