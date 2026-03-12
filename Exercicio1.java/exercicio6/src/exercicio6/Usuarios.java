/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

/**
 *
 * @author aluno.saolucas
 */
public class Usuarios {
    private String login;
    private String senha;

    
    public void setLogin(String login) {
        this.login = login;
    }

    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    public boolean autenticar(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);}
}
