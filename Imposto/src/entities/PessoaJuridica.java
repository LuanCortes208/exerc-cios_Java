package entities;

public class PessoaJuridica extends Pessoa {

	private Integer numeroFuncionarios;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double renda_anual, Integer numeroFuncionarios) {
		super(nome, renda_anual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	@Override
	public String calculoImposto() {
		if (numeroFuncionarios <= 10) {
			super.imposto = renda_anual*0.16;
			return nome + ": " + String.format("%.2f", super.imposto);
		} else {
			super.imposto = renda_anual*0.14;
			return nome + ": " + String.format("%.2f", super.imposto);
		}
	}
	
}
