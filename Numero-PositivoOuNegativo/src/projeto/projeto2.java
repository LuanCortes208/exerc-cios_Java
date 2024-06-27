package projeto;
import java.util.Scanner;

public class projeto2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Este programa tem como objetivo definir se o número digitado é positivo ou negativo.");
		System.out.print("Por favor, digite um número: ");
		int x = sc.nextInt();
		
		if (x >= 0) {
			System.out.printf("O número digitado foi %d e seu valor é positivo.%n", x);
		}
		else {
			System.out.printf("O número digitado foi %d e seu valor é negativo. %n", x);
		}
		
		sc.close();
	}

}
