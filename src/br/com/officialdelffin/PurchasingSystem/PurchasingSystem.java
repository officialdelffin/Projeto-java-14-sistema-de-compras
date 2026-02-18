
// Pacotes :
package br.com.officialdelffin.PurchasingSystem;


// Importações :

import br.com.officialdelffin.Products.Products;

import java.util.ArrayList;
import java.util.Scanner;


// Classe responsável por criar sistema :
public class PurchasingSystem {


    // Atributos :
    private double accountBalance;
    private int userChoice = 1;
    private String nameProductList;
    private double valueProductList;


    // Lists :
    ArrayList<Products> productsList = new ArrayList<>();


    // Metodos Getters e Setters :

    // Getters :

    public double getAccountBalance() {


        return accountBalance;


    }


    public int getUserChoice() {


        return userChoice;


    }


    public String getNameProductList() {


        return nameProductList;


    }


    public double getValueProductList() {


        return valueProductList;


    }

    // Setters :

    public void setAccountBalance(int accountBalance) {


        this.accountBalance = accountBalance;


    }


    public void setAccountBalance(double accountBalance) {


        this.accountBalance = accountBalance;


    }

    public void setUserChoice(int userChoice) {


        this.userChoice = userChoice;


    }

    public void setNameProductList(String nameProductList) {


        this.nameProductList = nameProductList;


    }

    public void setValueProductList(double valueProductList) {


        this.valueProductList = valueProductList;


    }


    // Metodos :

    // Roda o sistema de pagamento :
    public void purchasingSystem() {


        // Instancias :
        var inputUser = new Scanner(System.in);


        // Pedindo e armazenando saldo da conta :
        System.out.println("Digite o saldo da sua conta : " + "\n");
        this.setAccountBalance(inputUser.nextDouble());
        inputUser.nextLine();


        // Enquanto a escolha do usuário for 1 ele executa o loop :
        while (userChoice == 1) {


            // Exibindo saldo da conta :
            System.out.println("Saldo da conta : " + getAccountBalance() + "\n");


            // Pedindo e armazenando name do produto :
            System.out.println("Digite o nome do produto está comprando : " + "\n");
            setNameProductList(inputUser.nextLine());
            inputUser.nextLine();


            // Pedindo e armazenando valor do produto :
            System.out.println("Digite o valor do produto que está comprando " + "\n");
            setValueProductList(inputUser.nextDouble());


            // Se o saldo da conta for maior ou igual ao valor do produto :
            if (accountBalance >= valueProductList) {


                // Cobrando o valor do produto no saldo da conta :
                accountBalance = accountBalance - valueProductList;


                // Armazenando o produto na lista de produtos e exibindo que a compra foi realizada:
                productsList.add(new Products(getNameProductList(), getValueProductList()));
                System.out.println("Compra realizada com sucesso! " + "\n");


            }


            // Se o saldo da conta for menor do que o valor do produto :
            else if (accountBalance < valueProductList) {


                System.out.println("Saldo insuficiente para comprar produto" + "\n");


            }


            // Verificando se usuário que fazer mais comprar ou se quer sair do sistema :
            System.out.println("Digite 1 para ficar e 2 para sair do sistema : " + "\n");
            this.setUserChoice(inputUser.nextInt());


        }


    }


}
