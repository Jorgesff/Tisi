/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.Modelo;

import java.util.ArrayList;
import projeto.Objetos.Cliente;
/**
 *
 * @author jorgesff
 */
public interface ClienteDAO {
    public void insert(String nome,String telefone,String username,String password);
    public int Search_login(String username, String password);
    public ArrayList<Cliente> Search_intern(String username);
    public void delete(String username, String password);
}