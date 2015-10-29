/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import projeto.Objetos.Cliente;

/**
 *
 * @author jorgesff
 */
public class ClienteDAOImpl implements ClienteDAO {
    private PreparedStatement stat;
    private Connection conn;
    @Override
    public void insert(String nome, String telefone, String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Search_login(String username, String password) {
        int status = 1;
        ArrayList<Cliente> autorizado = new ArrayList();
        try {
                conn = Database.Conect();
                Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.INFO, "CONECTADO AO BANCO");
                String query = "select username, senha from tb_cliente where username = ? and senha = ?;";
                
                stat = conn.prepareStatement(query);
                stat.setString(1, username);
                stat.setString(2, password);
                ResultSet result = stat.executeQuery();
                 Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.INFO, "QUERY EXECUTADA");
               // System.out.println(result.getArray("username"));
                while(result.next()){
                    Cliente x = new Cliente();
                    x.setUsername(result.getString("username"));
                    x.setPassword(result.getString("senha"));
                    autorizado.add(x);
                     Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.INFO, "ADICIONADO 1 ELEMENTO");
                }
                
                if(autorizado.isEmpty())
                    return 0;
                else 
                    return 1;
        } catch (SQLException ex) {
            
            Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, "não autorizou", ex);
            
        }
                return 0;
    }

    @Override
    public ArrayList<Cliente> Search_intern(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }

    @Override
    public void delete(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
