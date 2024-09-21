package entities;

public abstract class Pessoa {
	
	protected String nome;
	protected Double renda_anual;
	protected Double imposto;
	
	public Pessoa() {
	}

	public Pessoa(String nome, Double renda_anual) {
		this.nome = nome;
		this.renda_anual = renda_anual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRenda_anual() {
		return renda_anual;
	}

	public void setRenda_anual(Double renda_anual) {
		this.renda_anual = renda_anual;
	}
	
	public Double getImposto() {
		return imposto;
	}

	public abstract String calculoImposto();
}
