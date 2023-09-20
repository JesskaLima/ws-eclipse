package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os valores da base e da altura");
		Retangulo retangulo = new Retangulo();
		
		retangulo.base = sc.nextDouble();
		retangulo.altura = sc.nextDouble();
		
		System.out.println(retangulo);
		
		
		sc.close();		
	}

}
