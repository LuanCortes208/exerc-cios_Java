package entities;

import exception.ExceptionBalanceIsSmallerOfAmount;
import exception.ExceptionWithdrawLimit;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance = 500.0;
	private Double withdrawLimit = 15000.00;
	
	public Account() {
	}

	public Account(Integer number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) {
		if (amount > withdrawLimit) {
			throw new ExceptionWithdrawLimit("Valor do saque é superior ao limite de saque de " + withdrawLimit);
		}
		if (amount > balance) {
			throw new ExceptionBalanceIsSmallerOfAmount("Valor do saldo é menor que o de saque.");
		}
		balance -= amount;
	}

}
