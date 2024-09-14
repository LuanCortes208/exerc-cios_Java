package entities;

public class Bank {
	
	private int num_conta;
	private String nome;
	private double saldo = 0.0;
	

	public Bank(int num_conta, String nome) {
		this.num_conta = num_conta;
		this.nome = nome;
	}
	
	public Bank(int num_conta, String nome, double deposito) {
		this.num_conta = num_conta;
		this.nome = nome;
		depositar(deposito);
	}


	public int getNum_conta() {
		return num_conta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor + 5.0;
	}
	
}
