package projeto;

import java.util.Scanner;
import java.util.Locale;

public class main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Este código tem por objetivo simular a compra de itens de uma lanchonete.");
		
		System.out.printf("Código     Especificação     Preço"
				+ "%n1          Cachorro quente     R$ 4,00"
				+ "%n2          X-salada            R$ 4,50"
				+ "%n3          X-bacon             R$ 5,00"
				+ "%n4          Torrada simples     R$ 2,00"
				+ "%n5          Refrigerante        R$ 1,50%n");
		System.out.printf("%nQual item deseja comprar? Digite o código: ");
		int codigo = sc.nextInt();
		double preco;
		int quantidade;
		
		switch (codigo) {
		case 1:
			preco = 4.00;
			break;
		case 2:
			preco = 4.50;
			break;
		case 3:
			preco = 5.00;
			break;
		case 4:
			preco = 2.00;
			break;
		case 5:
			preco = 1.50;
			break;
		default:
			preco = 0;
			System.out.println("Código inválido.");
		}
		
		if (preco != 0) {
			System.out.print("Por favor, digite a quantidade: ");
			quantidade = sc.nextInt();
			preco = quantidade * preco;
			System.out.printf("Preço: %.2f", preco);
		}
		
		sc.close();
	}

}
