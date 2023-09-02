import java.util.Locale;
import java.util.Scanner;

public class Entrada_de_Dados {

	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char x;
		x = sc.next().charAt(3);
		System.out.println("Voce digitou: " + x);
		
		sc.close();

	}

}
