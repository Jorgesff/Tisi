/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.Modelo;

import java.util.ArrayList;
import projeto.Objetos.Restaurante;
/**
 *
 * @author jorgesff
 */
public interface ClienteDAO { 
    //---------------- Metodos para implementação de cliente 
    public boolean insert(String nome,int id_cidade,String telefone,String email,String password);
    public boolean auth_cliente(String username, String password);
    public ArrayList<Restaurante> Search_intern(String busca, String tipo);
    public void delete(String username, String password);
    public boolean has_user(String email);
}
