package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		product.name = sc.next();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantidade: ");
		product.quantity = sc.nextInt();
		 
		System.out.println(product.name 
				+ ", " + product.price 
				+ ", " + product.quantity);
		
		
		
		
		
		sc.close();

	}

}
