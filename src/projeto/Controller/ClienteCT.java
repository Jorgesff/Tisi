/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.Controller;

import projeto.Modelo.ClienteDAOImpl;
import projeto.Objetos.Cliente;

/**
 *
 * @author jorgesff
 */
public class ClienteCT {
   
  public int Auth(String user, String pass){
      ClienteDAOImpl cliDAO = new ClienteDAOImpl();
      return cliDAO.Search_login(user, pass);
  }
}
