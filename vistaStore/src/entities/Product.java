package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double valorTotalEmEstoque(){

        return price * quantity;

    }

    public void addProduto(int quantity){

        this.quantity += quantity; // this.quantity refere-se ao quantity global, não ao atributo do método

    }

    public void removeProduto(int quantity){

        this.quantity -= quantity;

    }

    public String toString(){

        return name
                + ", R$ "
                + String.format("%.2f", price) + ", "
                + quantity
                + " unidades. Total R$ "
                + String.format("%.2f", valorTotalEmEstoque());

    }
}
