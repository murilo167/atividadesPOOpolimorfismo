/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercico6.java;

/**
 *
 * @author aluno.saolucas
 */
public class Exercico6Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Forma quadrado = new Quadrado();
        quadrado.setDimensaoPrincipal(4);

        Forma circulo = new Circulo();
        circulo.setDimensaoPrincipal(3);

        Forma triangulo = new Triangulo();
        triangulo.setDimensaoPrincipal(5);

        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Área do triângulo: " + triangulo.calcularArea());

    }
    
}
