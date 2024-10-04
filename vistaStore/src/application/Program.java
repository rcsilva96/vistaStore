package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Insira os dados do produto: ");
        System.out.println("Por favor, insira o nome do produto: ");
            product.name = scan.nextLine();

        System.out.println("Por favor, insira o preço do produto: ");
            product.price = scan.nextDouble();

        System.out.println("Por favor, insira a quantidade do produto em estoque: ");
            product.quantity = scan.nextInt();

        System.out.println(product);

        scan.close();
    }
}
