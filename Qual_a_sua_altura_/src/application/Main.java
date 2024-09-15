package application;

import java.util.Scanner;
import entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();
		String [] vet_nome = new String [n];
		int [] vet_idade = new int [n];
		float [] vet_altura = new float [n];
	
		Pessoa humano;
		String nome;
		int idade;
		float altura;
		
		float sum = 0f;
		float regra_de_tres;
		int qtd = 0;
		
		for (int i = 0; i < vet_nome.length; i++) {
			int parametro = i + 1;
			System.out.println("Dados da " + parametro + "a pessoa:");
			System.out.print("Nome: ");
			nome = sc.next();
			System.out.print("Idade: ");
			idade = sc.nextInt();
			System.out.print("Altura: ");
			altura = sc.nextFloat();
			
			humano = new Pessoa(nome, idade, altura);
			
			vet_nome[i] = humano.getNome();
			vet_idade[i] = humano.getIdade();
			vet_altura[i] = humano.getAltura();
			
			sum += vet_altura[i];
			
			if (vet_idade[i] < 16) {
				qtd += 1;
			}
		}
		
		sum = sum/vet_nome.length;
		regra_de_tres = (qtd * 100)/vet_nome.length;
		
		System.out.printf("%n%n");
		System.out.printf("Altura média: %.2f%n", sum);
		System.out.printf("Pessoas com menos de 16 anos: %.2f", regra_de_tres);
		System.out.println("%");
		for (int i = 0; i < vet_nome.length; i++) {
			if (vet_idade[i] < 16) {
				System.out.println(vet_nome[i]);
			}
		}
		
		
		sc.close();
	}

}
