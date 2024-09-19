package projeto;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha = 2002;
		
		System.out.println("Este programa tem como objetivo advinhar qual é a senha correta.");
		System.out.print("Portanto, advinhe a senha: ");
		
		int advinha = sc.nextInt();
		
<<<<<<< HEAD
=======
		
>>>>>>> 0a1fffa (Estrutura_while)
		while (advinha != senha) {
			System.out.println("Senha inválida");
			System.out.print("Advinhe a senha: ");
			advinha = sc.nextInt();
		}
		if (advinha == senha ) {
			System.out.println("Acesso permitido");
		}
		
		sc.close();
	}

}
