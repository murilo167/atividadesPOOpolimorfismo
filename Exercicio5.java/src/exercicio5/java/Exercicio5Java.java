/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5.java;

/**
 *
 * @author aluno.saolucas
 */
public class Exercicio5Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Pagamento pagamento1 = new CartaoCredito();
        Pagamento pagamento2 = new Pix();
        Pagamento pagamento3 = new Dinheiro();
        Pagamento pagamento4 = new Boleto();
        Pagamento pagamento5 = new TransferenciaBancaria();

        pagamento1.processarPagamento();
        pagamento2.processarPagamento();
        pagamento3.processarPagamento();
        pagamento4.processarPagamento();
        pagamento5.processarPagamento();

    }
    
}
