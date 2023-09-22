package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Entre com os dados do produto: ");
		
		System.out.print("Nome: ");
		String name = sc.next();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		Product product = new Product(name, price);
		
		System.out.println();
		System.out.println("Dados do produto: " + product);
		
		System.out.println();
		System.out.print("Entre com o numero de produtos "
				+ "a serem adicionados no estoque: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		System.out.println();
		System.out.print("Entre com o numero de produtos "
				+ "a serem retirados do estoque: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
			
		
		sc.close();

	}

}
