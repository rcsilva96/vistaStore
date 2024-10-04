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

        System.out.println("Dados do produto: " + product);

        System.out.println();
        System.out.println("Entre com o número de produtos a serem adicionados no estoque: ");
        int quantity = scan.nextInt();
        product.addProduto(quantity);
        System.out.println("Dados atualizados do produto: " + product);

        System.out.println("Entre com o número de produtos a serem removidos do estoque: ");
        quantity = scan.nextInt();
        if (quantity <= product.quantity) {
            product.removeProduto(quantity);
            System.out.println("Dados atualizados do produto: " + product);
        } else {
            System.out.println("ERRO FATAL: A quantidade a ser removida não pode ser maior que o valor em estoque. Encerrando o sistema...");
        }
        scan.close();
    }
}
