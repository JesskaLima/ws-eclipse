import java.util.Locale;
import java.util.Scanner;

/*
 Você deve fazer um programa que leia um valor qualquer e apresente 
 uma mensagem dizendo  em qual dos seguintes intervalos 
 ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
 Obviamente se o valor não estiver em nenhum destes intervalos, 
 deverá ser impressa a mensagem “Fora de intervalo”.
 */
public class IntervaloNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		
		if (x < 0.0 || x > 100.0) {		
				System.out.println("Fora do Intervalo");
		}
		else if (x >= 75.0) {
			System.out.println("Intervalo (75, 100]");
		}
		else if (x >= 50.0) {
			System.out.println("Intervalo (50, 75]");
		}
		else if (x >= 25.0) {
			System.out.println("Intervalo (25, 50]");
		}
		else {
			System.out.println("Intervalo (0, 25]");
		}
		
		
		
		
		
		sc.close();
		

	}

}
