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
import projeto.Objetos.Restaurante;

/**
 *  Falta criar o DAO pra verificar usuario repetido
 * @author jorgesff
 */
public class RestauranteDAOImpl implements RestauranteDAO {
    private PreparedStatement stat;
    private Connection conn;
    @Override
    public boolean insert(String nome_fant, String senha, String razao_social, String email, String telefone, String local, String local_nome, String numero, int cidade, String lotacao) {
        try {
            conn = Database.Conect();
            String query = "insert into cad_estabelecimentos(fantasia,razao,local,nome_local,numero,telefone,ativo,id_cidade,lotacao,tipo_usuario, email)"
                    + "values (?,?,?,?,?,?,?,?,?,?,?)";
            stat = conn.prepareStatement(query);
            stat.setString(1, nome_fant);
            stat.setString(2, razao_social);
            stat.setString(3, local);
            stat.setString(4, local_nome);
            stat.setString(5, numero);
            stat.setString(6, telefone);
            stat.setString(7,"s");
            stat.setInt(8, cidade);
            stat.setInt(9, Integer.parseInt(lotacao));
            stat.setString(10, "r");
            stat.setString(11, email);
            stat.execute();
            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(RestauranteDAOImpl.class.getName()).log(Level.SEVERE, "ERRO AO ADICIONAR NO BD", ex);
            return false;
        }
        
    }

    @Override
    public int select_nome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int select_cidade(String cidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Restaurante> select_cozinha(String nacionalidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean has_user(String email) {
        try {
                ArrayList<Restaurante> existente = new ArrayList();
                conn = Database.Conect();
                Logger.getLogger(RestauranteDAOImpl.class.getName()).log(Level.INFO, "CONECTADO AO BANCO has_user");
                String query = "select email from cad_estabelecimentos where email = ?;";
                
                stat = conn.prepareStatement(query);
                stat.setString(1, email);
                ResultSet result = stat.executeQuery();
                conn.close();
                 Logger.getLogger(RestauranteDAOImpl.class.getName()).log(Level.INFO, "QUERY EXECUTADA has_user");
               // System.out.println(result.getArray("username"));
                while(result.next()){
                    Restaurante x = new Restaurante();
                    x.setEmail(result.getString("email"));
                    existente.add(x);
                }
                if(existente.isEmpty()){
                    Logger.getLogger(RestauranteDAOImpl.class.getName()).log(Level.SEVERE, "Usuario valido");
                    return false;
                }else{ 
                    Logger.getLogger(RestauranteDAOImpl.class.getName()).log(Level.SEVERE, "Usuario ja existente");
                    return true;
                }
        } catch (SQLException ex) {
            Logger.getLogger(RestauranteDAOImpl.class.getName()).log(Level.SEVERE, "ERRO AO VERIFICAR REPETICAO", ex);
            
            return false;
        }
    }

    public boolean auth_res(String email, String password) {
        ArrayList<Restaurante> autorizado = new ArrayList();
        try {
                conn = Database.Conect();
                Logger.getLogger(RestauranteDAOImpl.class.getName()).log(Level.INFO, "CONECTADO AO BANCO auth");
                String query = "select email, senha from cad_clientes where email = ? and senha = ?;";
                
                stat = conn.prepareStatement(query);
                stat.setString(1, email);
                stat.setString(2, password);
                ResultSet result = stat.executeQuery();
                conn.close();
                 Logger.getLogger(RestauranteDAOImpl.class.getName()).log(Level.INFO, "QUERY EXECUTADA auth");
               // System.out.println(result.getArray("username"));
                while(result.next()){
                    Restaurante x = new Restaurante();
                    x.setEmail(result.getString("email"));
                    x.setPassword(result.getString("senha"));
                    autorizado.add(x);
                     Logger.getLogger(RestauranteDAOImpl.class.getName()).log(Level.INFO, "Usuario encontrado auth");
                }
                
                if(autorizado.isEmpty())
                    return false;
                else 
                    return true;
        } catch (SQLException ex) {
            
            Logger.getLogger(RestauranteDAOImpl.class.getName()).log(Level.SEVERE, "não autorizou", ex);
            
            return false;
        }
                
    }
    
}
