package application;

import java.util.InputMismatchException;
import java.util.Scanner;
import entities.Account;
import exception.ExceptionBalanceIsSmallerOfAmount;
import exception.ExceptionWithdrawLimit;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Titular: ");
		String nome = sc.nextLine();
		
		int numero_conta = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("N�mero da conta: ");
                numero_conta = sc.nextInt();
                validInput = true; 
            } catch (InputMismatchException e) {
                System.out.println("Dados inv�lidos! Digite um n�mero inteiro.");
                System.out.println();
                sc.nextLine();
                }}
		
		Account holder = new Account(numero_conta, nome);
		
		char resposta = 0;
		validInput = false;
		while (!validInput) {
			System.out.println("Deseja fazer um dep�sito inicial?");
			System.out.print("Resposta Sim(s) ou N�o(n): ");
			try {
				resposta = sc.next().toLowerCase().charAt(0);
				if (resposta != 's' && resposta != 'n') {
					throw new IllegalArgumentException("Resposta inv�lida! Digite 's' para sim ou 'n' para n�o.");
				} 
				validInput = true;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
				System.out.println();
				sc.nextLine();
			}}
		
		if (resposta == 's') {
			validInput = false;
			while (!validInput) {
				try {
					System.out.print("Valor do dep�sito: ");
					Double deposit = sc.nextDouble();
					holder.deposit(deposit);
					validInput = true;
				} catch (InputMismatchException e) {
					System.out.println("Dado inv�lido! Digite um n�mero.");
					System.out.println();
					sc.nextLine();
				}}
		}
		
		System.out.println();
		validInput = false;
		while (!validInput) {
		try {
			System.out.print("Digite um valor para saque: ");
			Double saque = sc.nextDouble();
			holder.withdraw(saque);
			validInput = true;
		} catch (InputMismatchException e) {
			System.out.println("Dado inv�lido! Digite um n�mero.");
		} catch (ExceptionWithdrawLimit e) {
			System.out.println(e.getMessage());
			System.out.println();
		} catch (ExceptionBalanceIsSmallerOfAmount e) {
			System.out.println(e.getMessage());
			System.out.println();
		}}
		
		System.out.println("Novo saldo: " + holder.getBalance());
		sc.close();
	}

}
