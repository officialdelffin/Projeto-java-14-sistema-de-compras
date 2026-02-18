
// Pacotes :
package br.com.officialdelffin.Products;


// Classe responsável por criar os produtos :
public class Products {


    // Atributos :

    private String name;
    private Double value;


    // Métodos Getters e Setters :

    // Getters :

    public String getName() {


        return name;


    }


    public Double getValue() {


        return value;


    }


    // Setters :

    public void setName(String name) {


        this.name = name;


    }


    public void setValue(Double value) {


        this.value = value;


    }


    // Construtores :

    public Products(String name, Double value) {


        this.setName(name);
        this.setValue(value);


    }


}