package entities;

public class PessoaFisica extends Pessoa{
	
	private Double gastosSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double renda_anual, Double gastosSaude) {
		super(nome, renda_anual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public String calculoImposto() {
		Double abaterSaude = null;
		if (renda_anual < 20000.00) {
			super.imposto = renda_anual*0.15;
		} else {
			super.imposto = renda_anual*0.25;
		}
		
		if (gastosSaude != 0) {
			abaterSaude = (gastosSaude*0.50);
			super.imposto = super.getImposto() - abaterSaude;
			return nome + ": " + String.format("%.2f", super.imposto);
		} else {
			return nome + ": " + String.format("%.2f", super.imposto);
		}
	}
}
