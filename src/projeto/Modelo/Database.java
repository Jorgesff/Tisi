/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jorgesff
 */
public class Database {
    
    private static Connection conn;
    
    public static Connection Conect() throws SQLException{
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/Easy_dinner";
            String user = "postgres";
            String password = "root";
            conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, "Não conectou ao banco de dados", ex);
        }
        return null;
    }
}
