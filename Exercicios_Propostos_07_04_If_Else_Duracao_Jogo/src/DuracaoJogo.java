import java.util.Scanner;

/*Leia a hora inicial e a hora final de um jogo. 
A seguir calcule a duração do jogo, sabendo 
que o mesmo pode começar em um dia e terminar em 
outro, tendo uma duração mínima de 1 hora e máxima 
de 24 horas.*/

public class DuracaoJogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int hora_inicial = sc.nextInt();
		int hora_final = sc.nextInt();

		if (hora_inicial > hora_final) {
			int resultado_inicial = 24 - hora_inicial;
			int resultado_final = 0 + hora_final;
			int duracao_jogo = resultado_inicial + resultado_final;
			System.out.printf("O jogo durou %d hora(s)", duracao_jogo);
		} else {
			int duracao_jogo = hora_final - hora_inicial;
			System.out.printf("O jogo durou %d hora(s)", duracao_jogo);
		}

		sc.close();
	}

}
