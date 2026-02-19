
// Pacotes :
package br.com.officialdelffin.MainExecution;


// Importações :
import br.com.officialdelffin.PurchasingSystem.PurchasingSystem;
import java.util.Scanner;


// Classe principal :
public class Main {


    // Metodos :

    // Metodo de execução do sistema :
    public static void main(String[] args) {


        // Instanciando o objeto responsável pelo sistema de compras :
        var system = new PurchasingSystem();


        // Mensagem de bem-vindo :
        System.out.printf("Seja bem-vindo ao sistema de compras \n");


        // Chamdando o sistema de pagemento :
        system.purchasingSystem();


    }


}