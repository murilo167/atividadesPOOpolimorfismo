/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4.java;

/**
 *
 * @author aluno.saolucas
 */
public class Exercicio4Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
          Gerente gerente = new Gerente();
        Vendedor vendedor = new Vendedor();
        Programador programador = new Programador();
        Designer designer = new Designer();
        SuporteTecnico suporte = new SuporteTecnico();

        gerente.trabalhar();
        vendedor.trabalhar();
        programador.trabalhar();
        designer.trabalhar();
        suporte.trabalhar();

    }
    
}
