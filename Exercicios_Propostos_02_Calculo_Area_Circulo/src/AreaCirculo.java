import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double r = sc.nextDouble();
		double pi = 3.14159;
		double area = pi * Math.pow(r, 2.0);
		
		System.out.printf("A = %.4f%n", area);

	}

}
