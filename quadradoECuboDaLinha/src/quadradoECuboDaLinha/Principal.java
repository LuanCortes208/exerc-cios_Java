package quadradoECuboDaLinha;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Este programa faz a leitura de um número e retorna cada linha até a quantidade definida com seu quadrado e seu cubo.");
		
		String repetir;
		do {
			System.out.println("");
			System.out.print("Qual o número de linhas: ");
			int qtd_linhas = sc.nextInt();
			
			while (qtd_linhas < 0) {
				System.out.println("Você só pode digitar um número inteiro positivo.");
				System.out.print("Qual o número de linhas: ");
				qtd_linhas = sc.nextInt();
			}
			
			for (int i = 1; i <= qtd_linhas; i++) {
				int quadrado = (int) Math.pow(i, 2);
				int cubo = (int) Math.pow(i, 3);
				System.out.printf("%d %d %d %n", i, quadrado, cubo);
			}
			
			System.out.println("");
			System.out.print("Deseja repetir (sim ou não):");
			repetir = sc.next();
			} while(repetir.equals("sim"));
		
		sc.close();
	}

}
