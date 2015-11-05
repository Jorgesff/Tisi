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
   private String nome, usuario, email,local,endereco,telefone, password ;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   private int lotacao,numero;

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

    public  String getNome() {
        return nome;
    }

    public  void setNome(String nome) {
        this.nome = nome;
    }

    public  String getUsuario() {
        return usuario;
    }

    public  void setUsuario(String usuario) {
        this.usuario = usuario;
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

    public  int getNumero() {
        return numero;
    }

    public  void setNumero(int numero) {
        this.numero = numero;
    }
}
