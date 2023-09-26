import java.util.Scanner;

/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.*/

public class Multiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x % x == 0) {
			if (y % x == 0) {
				System.out.println("Multiplos");
			}
			else {
				System.out.println("Nao sao multiplos");
			}
			
		}

	}

}
