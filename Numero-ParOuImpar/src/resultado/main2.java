package resultado;
import java.util.Scanner;

public class main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Este programa tem como objetivo definir se um número é par ou ímpar.");
		System.out.print("Por favor, digite um número: ");
		int x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.printf("%nO número que você digitou (%d) é par!", x);
		}
		else {
			System.out.printf("%nO número que você digitou (%d) é ímpar!", x);
		}

		sc.close();
	}

}
