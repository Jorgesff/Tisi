/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.Controller;

import java.util.ArrayList;
import projeto.Modelo.ClienteDAOImpl;
import projeto.Objetos.Restaurante;

/**
 *
 * @author jorgesff
 */
public class ClienteCT {
    //--------------- Metodo Controller para autenticar usuario----- Retorno true: usuario autenticado false: não autenticado
  public boolean Auth(String user, String pass){  
      ClienteDAOImpl cliDAO = new ClienteDAOImpl();
      return cliDAO.auth_cliente(user, pass);
      
  }//-------------- metodo controller para adicionar novo usuario
  public boolean novo(String nome,int id_cidade, String telefone, String email, String password){ 
        ClienteDAOImpl cliDAO = new ClienteDAOImpl();
        return cliDAO.insert(nome, id_cidade, telefone, email, password);
        
  }// -------------- Metodo controller para verificação de usuario ja existente Retorno true: false: primeiro usuario true: usuario repetido
  public boolean has_user(String email){                    
      ClienteDAOImpl cliDAO = new ClienteDAOImpl();
      return cliDAO.has_user(email);
  }
  public ArrayList<Restaurante> busca(String busca, String tipo){
      ClienteDAOImpl cliDAO = new ClienteDAOImpl();
      return cliDAO.Search_intern(busca, tipo);
  }
}
