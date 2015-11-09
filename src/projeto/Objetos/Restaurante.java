/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.Objetos;

/**
 *
 * @author jorgesff
 */
public class Restaurante {
   private String fantasia, email,local,endereco,cidade,telefone, password,numero ;
   private int lotacao;
   
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
  
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLotacao() {
        return lotacao;
    }

    public  void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }

    public  String getTelefone() {
        return telefone;
    }

    public  void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public  String getFantasia() {
        return fantasia;
    }

    public  void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public  String getEmail() {
        return email;
    }

    public  void setEmail(String email) {
        this.email = email;
    }

    public  String getLocal() {
        return local;
    }

    public  void setLocal(String local) {
        this.local = local;
    }

    public  String getEndereco() {
        return endereco;
    }

    public  void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public  String getNumero() {
        return numero;
    }

    public  void setNumero(String numero) {
        this.numero = numero;
    }
}
