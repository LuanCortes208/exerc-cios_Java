package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List <Pessoa> list = new ArrayList<>();
		
		System.out.println("Qual o n�mero de contribuintes?");
		System.out.print("Resposta.: ");
		int numero_contribuintes = sc.nextInt();
		
		for (int i = 1; i <= numero_contribuintes; i++) {
			System.out.println("Contribuinte #"+ i);
			System.out.print("Pessoa F�sica (f) ou Pessoa Jur�dica (j): ");
			char pessoa = sc.next().toLowerCase().charAt(0);
			
			sc.nextLine();
			
			if (pessoa != 'j' && pessoa != 'f') {
				while (pessoa != 'j' && pessoa != 'f') {
					System.out.println("Digite um valor v�lido.");
					System.out.println("Contribuinte #"+ i);
					System.out.print("Pessoa F�sica (f) ou Pessoa Jur�dica (j): ");
					pessoa = sc.next().toLowerCase().charAt(0);
					
					sc.nextLine();
				}
			}
			if (pessoa == 'j') {
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Renda anual: ");
				double renda_anual = sc.nextDouble();
				System.out.print("N�mero de funcion�rios: ");
				int numero_funcionarios = sc.nextInt();
				
				Pessoa pessoaJuridica = new PessoaJuridica(nome, renda_anual, numero_funcionarios);
				list.add(pessoaJuridica);
				
			} else if (pessoa == 'f') {
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Renda anual: ");
				double renda_anual = sc.nextDouble();
				System.out.print("Gastos com Sa�de: ");
				double gastosSaude = sc.nextDouble();
				
				Pessoa pessoaFisica = new PessoaFisica(nome, renda_anual, gastosSaude);
				list.add(pessoaFisica);
			}
		}
		
		System.out.printf("%n%nTabela de impostos: %n");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).calculoImposto());
		}
		System.out.println();
		System.out.print("Total das taxas de impostos: ");
		Double sum = 0.0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i).getImposto();
		}
		System.out.println(sum);
		
		sc.close();
	}

}
