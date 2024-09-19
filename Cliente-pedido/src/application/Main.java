package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Product;
import entities.OrderItem;
import entities.Client;
import entities.enuns.OrderLevel.OrderStatus;
import entities.Order;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dados do cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Data de aniversário (dd/mm/yyyy): ");
		SimpleDateFormat data_formatada = new SimpleDateFormat("dd/MM/yyyy");
		Date aniversario = data_formatada.parse(sc.nextLine());
		
		System.out.println();
		
		System.out.println("Dados do pedido: ");
		System.out.print("Status: " + OrderStatus.PROCESSING);
		System.out.printf("%nQuantidade de itens: ");
		int qtd = sc.nextInt();
		sc.nextLine();
		
		Order cliente = new Order(new Date(), OrderStatus.PROCESSING, new Client(nome, email, aniversario));
		
		for(int i = 1; i <= qtd; i++) {
			System.out.println("Dados do item #"+ i);
			System.out.print("Nome do produto: ");
			String nome_produto = sc.nextLine();
			System.out.print("Preço do produto: ");
			Double preco = sc.nextDouble();
			System.out.print("Quantidade: ");
			int qtd1 = sc.nextInt();
			sc.nextLine();
			
			cliente.addItem(new OrderItem(qtd1, new Product(nome_produto, preco)));
		}
		
		System.out.println();
		System.out.println("Revisão do pedido: ");
		System.out.println("Data do pedido: " + cliente.getMoment());
		System.out.println("Status do pedido: " + cliente.getStatus());
		System.out.println("Cliente: " + cliente.getClient().toString());
		System.out.println("Itens do pedido: ");
		System.out.print(cliente.toStringItems());
		System.out.print("Preço total: ");
		System.out.println(cliente.total());
		
		sc.close();
	}

}
