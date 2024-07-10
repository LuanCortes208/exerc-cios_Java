package descobrindoDivisores;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Este programa tem como objetivo descobrir quais são os divisores do número digitado");
		System.out.println("Vamos começar!");
		
		String repetir;
		do {
			System.out.println("");
			System.out.print("Digite o número inteiro: ");
			int numero = sc.nextInt();
			
			for (int i = 1; i <= numero; i++) {
				if (numero%i == 0) {
					System.out.println(i);
				}
			}
			System.out.print("Deseja repetir (sim) ou (nao): ");
			repetir = sc.next();
		} while (repetir.equals("sim"));

		sc.close();
	}

}
