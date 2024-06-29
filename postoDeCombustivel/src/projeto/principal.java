package projeto;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Este programa tem como objetivo definir a preferência dos clientes num posto de combustível.");
		System.out.printf("%n-----------------Seja bem vindo, prezado cliente.-----------------%n");
		System.out.printf("Por favor, digite a opção deseja pelo senhor: "
				+"%n1 - Álcool%n"
				+ "2 - Gasolina%n"
				+ "3 - Diesel%n"
				+ "4 - Fim%n"
				+ "Qual sua opção: ");
		
		int opcao = sc.nextInt();
		int quant_alcool = 0;
		int quant_gasolina = 0;
		int quant_diesel = 0;
		
		while (opcao != 4) {
			if (opcao > 4) {
				System.out.println("Digite um código válido.");
				System.out.print("Qual sua opção: ");
				opcao = sc.nextInt();
			}
			switch (opcao) {
				case 1:
					quant_alcool += 1;
					break;
				case 2:
					quant_gasolina += 1;
					break;
				case 3:
					quant_diesel += 1;
					break;
			}
			System.out.printf("%nObrigado pela preferência!%n");
			System.out.print("Qual sua opção: ");
			opcao = sc.nextInt();
		}
		
		System.out.println("");
		System.out.println("Muito Obrigado!");
		System.out.printf("Álcool: %d%n", quant_alcool);
		System.out.printf("Gasolina: %d%n", quant_gasolina);
		System.out.printf("Diesel: %d%n", quant_diesel);
		
		
		sc.close();
	}

}
