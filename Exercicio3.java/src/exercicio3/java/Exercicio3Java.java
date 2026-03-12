/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3.java;

/**
 *
 * @author aluno.saolucas
 */
public class Exercicio3Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Violao violao = new Violao();
        Piano piano = new Piano();

        Bateria bateria = new Bateria();
        Flauta flauta = new Flauta();
        Guitarra guitarra = new Guitarra();

        violao.tocar();
        piano.tocar();
        bateria.tocar();
        flauta.tocar();
        guitarra.tocar();
    }
    
}
