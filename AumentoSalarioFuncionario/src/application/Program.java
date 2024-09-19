package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		List <Funcionario> funcionario1 = new ArrayList<>();
		
		System.out.print("Quantidade de funcionários a ser cadastrados: ");
		int qtd = input.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			int parametro = i + 1;
			
			System.out.println("Funcionário " + "#" + parametro + ":");
			System.out.print("Id: ");
			int identificador = input.nextInt();
			
			
			for(int x = 0; x < funcionario1.size(); x++) {
				while (funcionario1.get(x).getId() == identificador) {
					System.out.printf("%nEsse Id já foi usado!%n");
					System.out.println("Funcionário " + "#" + parametro + ":");
					System.out.print("Id: ");
					identificador = input.nextInt();
				}
			}
			System.out.print("Nome: ");
			String nome1 = input.next();
			
			input.nextLine();
			
			System.out.print("Salário: ");
			double salario1 = input.nextDouble();
			System.out.println();
			
			Funcionario funcionario = new Funcionario(identificador, nome1, salario1);
			funcionario1.add(funcionario);
		}
		
		
		System.out.print("Introduzir a identificação do funcionário que vai ter um aumento salarial: ");
		int funcionarioId = input.nextInt();
		
		 Funcionario funcionario = funcionario1.stream().filter(x -> x.getId() == funcionarioId).findFirst().orElse(null);
		
		 
		Integer pos = posicao(funcionario1, funcionarioId);
		if (pos == null) {
			System.out.println("Id não existente.");
		} else {
			System.out.print("Introduzir a percentagem: ");
			Double percentagem = input.nextDouble();
			
			funcionario1.get(pos).aumentoSalario(percentagem);
		}
		
		System.out.printf("%nLista de funcionários: %n");
		for (int i = 0; i < funcionario1.size(); i++) {
			funcionario1.get(i).imprimir();
		}
		
		input.close();
		
	}
	
	public static Integer posicao(List<Funcionario> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			} 
		}
		return null;
	}
}