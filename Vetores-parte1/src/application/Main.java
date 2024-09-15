package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos n�meros voc� vai digitar?");
		int n = sc.nextInt();
		
		if (n > 10) {
			System.out.println("Resposta inv�lida! Digite um n�mero menor ou igual a 10 e maior que 0.");
		}
		
		double [] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um n�mero: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.println("N�MEROS NEGATIVOS: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}
