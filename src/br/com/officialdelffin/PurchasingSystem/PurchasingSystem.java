
// Pacotes :
package br.com.officialdelffin.PurchasingSystem;


// Importações :
import br.com.officialdelffin.Products.Products;
import java.util.ArrayList;
import java.util.Scanner;


// Classe responsável por criar sistema :
public class PurchasingSystem {


    // Atributos :
    private double accountBalance = 00.00;
    private int userChoice = 1;
    private String nameProductList;
    private double valueProductList;


    // Lists :
    ArrayList <Products> productsList = new ArrayList<>();


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
        accountBalance = inputUser.nextDouble();


        // Enquanto a escolha do usuário for 1 ele executa o loop :
        while ( userChoice == 1 ) {


            // Pedindo e armazenando name do produto :
            System.out.println("Digite o nome do produto está comprando : " + "\n");
            setNameProductList(inputUser.nextLine());


            // Pedindo e armazenando valor do produto :
            System.out.println("Digite o valor do produto que está comprando " + "\n");
            setValueProductList(inputUser.nextDouble());


            // Se o saldo da conta for maior ou igual ao valor do produto :
            if (accountBalance >= valueProductList) {


                // Cobrando o valor do produto no saldo da conta :
                accountBalance = accountBalance - valueProductList;


                // Armazenando o produto na lista de produtos e exibindo que a compra foi realizada:
                productsList.add(new Products(getNameProductList() , getValueProductList()));
                System.out.println("Compra realizada com sucesso! " + "\n");


                // Exibindo saldo da conta :
                System.out.println("Saldo da conta : " + getValueProductList() + "\n");


                // Exibindo titulo : compras realizadas :
                System.out.println("Suas compras no sistema : \n");
                
                
                // For i para exibir a lista de objetos : 
                for (Products products : productsList) {


                    System.out.println(products);

                    
                }


            }

            else {





            }


        }


    }


}
