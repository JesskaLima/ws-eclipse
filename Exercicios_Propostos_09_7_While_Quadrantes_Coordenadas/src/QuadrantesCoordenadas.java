import java.util.Scanner;

public class QuadrantesCoordenadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Q1");

			} else if (x < 0 && y > 0) {
				System.out.println("Q2");

			} else if (x < 0 && y < 0) {
				System.out.println("Q3");

			} else if (x > 0 && y < 0) {
				System.out.println("Q4");

			}
			x = sc.nextInt();
			y = sc.nextInt();
		}

		sc.close();
	}
}

