package projeto;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("O programa em questão brinca com coordenadas de quatro quadrantes.");
		System.out.println("Teremos duas coordenadas chamadas X e Y. Dito isso, vamos começar.");
		System.out.printf("%nDigite o valor de X: ");
		double x = sc.nextDouble();
		System.out.printf("%nDigite o valor de Y: ");
		double y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem!");
		}
		else if (x > 0 && y > 0) {
			System.out.printf("%nA sua coordenada se encontra no Quadrante 1!");
		}
		else if (x > 0 && y < 0) {
			System.out.printf("%nA sua coordenada se encontra no Quadrante 4!");
		}
		else if (x < 0 && y > 0) {
			System.out.printf("%nA sua coordenada se encontra no Quadrante 2!");
		}
		else {
			System.out.printf("%nA sua coordenada se encontra no Quadrante 3!");
		}
		
		sc.close();
	}

}