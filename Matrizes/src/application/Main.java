package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de linhas: ");
		int num1 = sc.nextInt();
		
		System.out.print("Digite o número de colunas: ");
		int num2 = sc.nextInt();
		
		int [][] matriz = new int[num1][num2];
		
		System.out.println();
		for (int i = 0; i < num1; i++) {
			for (int x = 0; x < num2; x++) {
				System.out.printf("%nDigite o número da linha %d, coluna %d: ", i, x);
				int posicao = sc.nextInt();
				matriz[i][x] = posicao;
			}
		}
		
		System.out.println();
		
		System.out.print("   ");	
		for (int c = 0; c < matriz[0].length;c++) {
			System.out.print(c+"°");
		}
		System.out.println();
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(i+"° ");
			for (int x = 0; x < matriz[0].length; x++) {
				if (x > 0) {
					System.out.print(" ");
				}
				System.out.print(matriz[i][x]);
			}
			System.out.println("");
		}
		
		System.out.println();
		System.out.println("Qual número deseja ler?");
		int num = sc.nextInt();
		
		System.out.println();
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				if (matriz[i][j] == num) {
					System.out.println("Posição " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Esquerda: " + matriz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Acima: " + matriz[i-1][j]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("Direita: " + matriz[i][j+1]);
					}
					if (i < matriz.length-1) {
						System.out.println("Em baixo: " + matriz[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}
