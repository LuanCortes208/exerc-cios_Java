package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("O número de produtos: ");
		int numero = sc.nextInt();
		
		List <Product> produto = new ArrayList<>();
		
		for (int i = 1; i <= numero; i++) {
			System.out.println("Dados do produto #" + i);
			System.out.print("Comum, usado ou importado (c,u,i): ");
			char decision = sc.next().toLowerCase().charAt(0);
			
			while (decision != 'c' && decision != 'u' && decision != 'i') {
				System.out.println("Valor inválido! Digite novamente.");
				System.out.println();
				System.out.println("Dados do produto #" + i);
				System.out.print("Comum, usado ou importado (c,u,i): ");
				decision = sc.next().toLowerCase().charAt(0);
			}
			
			sc.nextLine();
			if (decision == 'c') {
				System.out.print("Nome: ");
				String name = sc.nextLine();
				System.out.print("Preço: ");
				double price = sc.nextDouble();
				
				Product produto1 = new Product(name, price);
				produto.add(produto1);
			} else if (decision == 'u') {
				System.out.print("Nome: ");
				String name = sc.nextLine();
				System.out.print("Preço: ");
				double price = sc.nextDouble();
				System.out.print("Data de fabricação (dd/MM/yyyy): ");
				sc.nextLine();
				SimpleDateFormat data_formatada = new SimpleDateFormat("dd/MM/yyyy");
				Date manuFactureDate = data_formatada.parse(sc.nextLine());
				
				Product produto2 = new UsedProduct(name, price, manuFactureDate);
				produto.add(produto2);
			} else {
				System.out.print("Nome: ");
				String name = sc.nextLine();
				System.out.print("Preço: ");
				double price = sc.nextDouble();
				System.out.print("Taxa alfandegária: ");
				double taxa = sc.nextDouble();
				
				Product produto3 = new ImportedProduct(name, price, taxa);
				produto.add(produto3);
			}
		}
		System.out.printf("%n%n");
		System.out.println("Tags de preço: ");
		for (int i = 0; i < produto.size(); i++) {
			System.out.println(produto.get(i).priceTag());
		}
		
		sc.close();
	}

}
