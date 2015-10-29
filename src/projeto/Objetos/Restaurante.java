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
   static private String nome, usuario, email,local,endereco,numero,telefone;

    public static String getTelefone() {
        return telefone;
    }

    public static void setTelefone(String telefone) {
        Restaurante.telefone = telefone;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Restaurante.nome = nome;
    }

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        Restaurante.usuario = usuario;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Restaurante.email = email;
    }

    public static String getLocal() {
        return local;
    }

    public static void setLocal(String local) {
        Restaurante.local = local;
    }

    public static String getEndereco() {
        return endereco;
    }

    public static void setEndereco(String endereco) {
        Restaurante.endereco = endereco;
    }

    public static String getNumero() {
        return numero;
    }

    public static void setNumero(String numero) {
        Restaurante.numero = numero;
    }
}
