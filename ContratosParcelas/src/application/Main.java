package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre os Dados do contrato: ");
		
		boolean validInput = false;
		
		int numero = 0;
		while (!validInput) {
			try {
			System.out.print("Número: ");
			numero = sc.nextInt();
			validInput = true;
			} catch (InputMismatchException e) {
				System.out.printf("%nValor inválido! Digite um número inteiro.%n%n");
				sc.nextLine();
			}
		}
		
		sc.nextLine();
		
		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		validInput = false;
		String dataContrato;
		LocalDate data = null;
		while (!validInput) {
			try {
			System.out.print("Data (dd/MM/yyyy): ");
			dataContrato = sc.nextLine();
			data = LocalDate.parse(dataContrato, sdf);
			validInput = true;
		} catch (DateTimeParseException e) {
		    System.out.printf("%nFormato de data inválido. Por favor, use o formato dd/MM/yyyy.%n%n");
		    sc.nextLine();
		} }
		
		validInput = false;
		Double valorContrato = null;
		while (!validInput) {
			try {
			System.out.print("Valor do contrato: ");
			valorContrato = sc.nextDouble();
			validInput = true;
			} catch (InputMismatchException e) {
				System.out.printf("%nValor inválido! Digite um número.%n%n");
				sc.nextLine();
			}
		}
		
		validInput = false;
		int numeroParcelas = 0;
		while (!validInput) {
			try {
			System.out.print("Entre com o número de parcelas: ");
			numeroParcelas = sc.nextInt();
			validInput = true;
			} catch (InputMismatchException e) {
				System.out.printf("%nValor inválido! Digite um número.%n%n");
				sc.nextLine();
			}
		}
		
		Contract contract = new Contract(numero, data, valorContrato);
		
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, numeroParcelas);
		
		System.out.println("Parcelas: ");
		for(Installment contract1 : contract.getInstallments()) {
			System.out.println(contract1);
		}
		
			sc.close();
	}
}