package entities;

import java.time.LocalDate;

public class Installment {
	private LocalDate dueDate;
	private Double amount;
	
	public Installment() {
	}

	public Installment(LocalDate data, Double amount) {
		this.dueDate = data;
		this.amount = amount;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return dueDate + " " + amount;
	}
	
}
