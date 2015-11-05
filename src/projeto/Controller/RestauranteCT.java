/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.Controller;

import projeto.Modelo.RestauranteDAOImpl;

/**
 *
 * @author jorgesff
 */
public class RestauranteCT {
    //------------------- Metodo Controller para adicionar novo usuario
    public boolean novo(String nome_fant, String senha, String razao_social, String email, String telefone, String local, String local_nome, String numero, int cidade, String lotacao){
        RestauranteDAOImpl resDAO = new RestauranteDAOImpl();
        return resDAO.insert(nome_fant, senha, razao_social, email, telefone, local, local_nome, numero, cidade, lotacao);
    }
    //-------------------Metodo Controller para verificação de usuario existente------ Retorno: true: usuario repetido false: primeiro usuario
    public boolean has_user(String email){
        RestauranteDAOImpl resDAO = new RestauranteDAOImpl();
        return resDAO.has_user(email);
    }
    //-------------------Metodo Controller para Autenticação de usuario---- Retorno: true: autenticado false:não autenticado
    public boolean auth_restaurante(String email, String password){
        RestauranteDAOImpl resDAO = new RestauranteDAOImpl();
        return resDAO.auth_res(email, password);
    }
}
