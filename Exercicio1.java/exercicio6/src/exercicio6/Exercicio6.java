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
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Usuario usuario = new Usuario();

        usuario.setLogin("admin");
        usuario.setSenha("1234");

        boolean acesso = usuario.autenticar("admin", "1234");

        if (acesso) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Login ou senha incorretos!");}
    }
    
}
