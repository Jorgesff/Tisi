/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import projeto.Objetos.Restaurante;

/**
 *  Falta criar o DAO pra verificar usuario repetido
 * @author jorgesff
 */
public class RestauranteDAOImpl implements RestauranteDAO {
    private PreparedStatement stat;
    private Connection conn;
    @Override
    public boolean insert(String nome_fant, String senha, String razao_social, String email, String telefone, String local, String local_nome, String numero, int cidade, int lotacao) {
        try {
            conn = Database.Conect();
            String query = "insert into cad_restaurante(fantasia,razao,local,nome_local,numero,telefone,ativo,id_cidade,lotacao,tipo_usuario)"
                    + "values (?,?,?,?,?,?,?,?,?,?)";
            stat = conn.prepareStatement(query);
            stat.setString(1, nome_fant);
            stat.setString(2, razao_social);
            stat.setString(3, local);
            stat.setString(4, local_nome);
            stat.setString(5, numero);
            stat.setString(6, telefone);
            stat.setString(7,"s");
            stat.setInt(8, cidade);
            stat.setInt(9, lotacao);
            stat.setString(10, "r");
            stat.execute();
            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(RestauranteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
