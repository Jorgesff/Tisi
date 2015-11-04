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
    public boolean insert(String nome,int id_cidade, String telefone, String email, String password) {
        try {
            conn = Database.Conect();
            Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.INFO, "CONECTADO AO BANCO");
            String query = "insert into cad_clientes(nome,id_cidade,telefone,email,senha,tipo_usuario) values"
                    + " (?,?,?,?,?,'c')";
            stat =conn.prepareStatement(query);
            stat.setString(1, nome);
            stat.setInt(2, id_cidade);
            stat.setString(3, telefone);
            stat.setString(4, email);
            stat.setString(5, password);
            stat.execute();
            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }

 
    @Override
    public int Search_login(String username, String password) {
        ArrayList<Cliente> autorizado = new ArrayList();
        try {
                conn = Database.Conect();
                Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.INFO, "CONECTADO AO BANCO");
                String query = "select email, senha from cad_clientes where email = ? and senha = ?;";
                
                stat = conn.prepareStatement(query);
                stat.setString(1, username);
                stat.setString(2, password);
                ResultSet result = stat.executeQuery();
                conn.close();
                 Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.INFO, "QUERY EXECUTADA");
               // System.out.println(result.getArray("username"));
                while(result.next()){
                    Cliente x = new Cliente();
                    x.setUsername(result.getString("email"));
                    x.setPassword(result.getString("senha"));
                    autorizado.add(x);
                     Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.INFO, "Usuario encontrado");
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

    @Override
    public boolean has_user(String email) {
        try {
                ArrayList<Cliente> existente = new ArrayList();
                conn = Database.Conect();
                Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.INFO, "CONECTADO AO BANCO");
                String query = "select email from cad_clientes where email = ?;";
                
                stat = conn.prepareStatement(query);
                stat.setString(1, email);
                ResultSet result = stat.executeQuery();
                conn.close();
                 Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.INFO, "QUERY EXECUTADA");
               // System.out.println(result.getArray("username"));
                while(result.next()){
                    Cliente x = new Cliente();
                    x.setUsername(result.getString("email"));
                    existente.add(x);
                     Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.INFO, "Usuario encontrado");
                }
                
                if(existente.isEmpty())
                    return false;
                else 
                    return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            
            return false;
        }
        
    }
    
}
