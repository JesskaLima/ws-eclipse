package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

/*Em um banco, para se cadastrar uma conta bancária, é necessario
 * informar o numero da conta, o nome do titular da conta, e o 
 * valor inicial que o titular depositou ao abrir a conta. Este valor de depósito 
 * inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a
 * depositar no momento de abrir sua conta, o depósito inicial não será feito e
 * o saldo inicial será, naturalmente, zero.
 * 
 * Importante: uma vez que uma conta bancária foi aberta, o numero da conta nunca 
 * poderá ser alterado. Já o nome do titular pode ser alterado (pois uma pessoa pode
 * mudar de nome na ocasião de casamento, por exemplo).
 * 
 * Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um 
 * mecanismo para proteger isso. O saldo só amenta por meio de depósitos, e só diminui
 * por meio de saques. Para cada saque realizado, o banco cobra
 * uma taxa de $5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for suficiente
 * para realizar o saque e/ou pagar a taxa.
 * 
 * Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou 
 * não informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque,
 * sempre mstrando os dados da conta após cada operação.*/

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria account;
		
		System.out.print("Cadastre o numero da conta: ");
		int number = sc.nextInt();
		System.out.print("Digite o nome do titular: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Tem deposito inicial (y/n)? ");
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.print("Entre com o valor do deposito inicial: ");
			double inicialDeposit = sc.nextDouble(); 
			account = new ContaBancaria(number, holder, inicialDeposit);
		}
		else {
			account = new ContaBancaria(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Entre com o valor de deposito: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Entre com o valor de saque: ");
		double withdrawValue = sc.nextDouble();
		account.saque(withdrawValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		
		
		
		
		sc.close();
		

	}

}
