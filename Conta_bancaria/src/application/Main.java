package application;

import java.util.Scanner;
import entities.Bank;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número de conta: ");
		int num_conta = sc.nextInt();
		System.out.print("Nome: ");
		String nome = sc.next();
		String resposta;
		sc.nextLine();
		
		Bank usuario;
		
		do {
			System.out.println("Deseja realizar um depósito inicial: Sim(s) ou Não(n)");
			System.out.print("Resposta: ");
			resposta = sc.next().toLowerCase();
			System.out.println(resposta);
			
			if ((resposta.equals("n") && resposta.equals("s"))) {
				System.out.printf("Resposta inválida!%nDigite (s) para sim ou (n) para não%n%n");
			}
		} while (resposta.equals("n") && resposta.equals("s"));
		
		double deposito = 0;
		
		if (resposta.equals("s")) {
			System.out.print("Depósito inicial, por favor: ");
			deposito = sc.nextDouble();
			usuario = new Bank(num_conta, nome, deposito);
		} else {
			usuario = new Bank(num_conta, nome, deposito);
		}
		
		System.out.printf("%n%n");
		
		System.out.println("Dados da conta: ");
		System.out.printf("Conta: %s%nTitular: %s%nSaldo: %.2f%n%n", usuario.getNum_conta(), usuario.getNome(), usuario.getSaldo());
		
		System.out.print("Depositar: ");
		deposito = sc.nextDouble();
		usuario.depositar(deposito);
		System.out.printf("%n%nDados da conta atualizados: %n");
		System.out.printf("Conta: %s%nTitular: %s%nSaldo: %.2f%n%n", usuario.getNum_conta(), usuario.getNome(), usuario.getSaldo());
		
		System.out.print("Saque: ");
		double sacar = sc.nextDouble();
		usuario.sacar(sacar);
		System.out.printf("%n%nDados da conta atualizados: %n");
		System.out.printf("Conta: %s%nTitular: %s%nSaldo: %.2f%n%n", usuario.getNum_conta(), usuario.getNome(), usuario.getSaldo());
		
		sc.close();
	}

}
