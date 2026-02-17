
// Pacotes :
package br.com.officialdelffin.PurchasingSystem;


import java.util.Scanner;

// Classe responsável por criar sistema :
public class PurchasingSystem {


    // Atributos :
    private double accountBalance = 00.00;
    private int userChoice = 1;


    // Metodos Getters e Setters :

    // Getters :

    public double getAccountBalance() {


        return accountBalance;


    }


    // Setters :

    public void setAccountBalance(int accountBalance) {


        this.accountBalance = accountBalance;


    }


    // Metodos :

    // Roda o sistema de pagamento :
    public void purchasingSystem() {


        // Instancias :
        var inputUser = new Scanner(System.in);


        // Pedindo e armazenando saldo da conta :
        System.out.println("Digite o saldo da sua conta : \n");
        accountBalance = inputUser.nextDouble();

        while ( userChoice == 1 ) {





        }




    }


}
