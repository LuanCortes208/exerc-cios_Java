package entities;

public class Pessoa {
	
	private String nome;
	private int idade;
	private float altura;
	
	public Pessoa(String nome, int idade, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public float getAltura() {
		return altura;
	}
	
	

}
