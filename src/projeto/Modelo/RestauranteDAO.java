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
public interface RestauranteDAO {
    public boolean auth_res(String email, String password); 
    public boolean insert(String nome_fant, String senha, String razao_social, String email, String telefone,String local, String local_nome,String numero, int cidade,String lotacao);
    public int select_nome(String nome);
    public int select_cidade(String cidade);
    public int delete(String nome);
    public ArrayList<Restaurante> select_cozinha(String nacionalidade);
    public boolean has_user(String email);
}  
