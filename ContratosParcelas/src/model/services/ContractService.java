package model.services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	
	
	public ContractService() {
	}

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {
		
		Double amount = contract.getTotalValue()/months;
		 for(int i = 1; i <= months; i++) {
			 LocalDate data = contract.getDate().plusMonths(i);
			 
			 double interest = onlinePaymentService.interest(amount, i);
			 double fee = onlinePaymentService.paymentFee(interest + amount);
			 
			 double total = amount + interest + fee;
			 
			 contract.addInstallment(new Installment(data, total));
			 
		 }
	}
	
}
