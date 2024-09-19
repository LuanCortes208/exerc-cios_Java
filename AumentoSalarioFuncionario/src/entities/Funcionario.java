package entities;

public class Funcionario {
	
	private int id;
	private String nome;
	private double salario;
	
	
	public Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getId() {
		return id;
	}
	public Double getSalario() {
		return salario;
	}
	
	public void aumentoSalario (Double percentagem) {
		salario += (salario * percentagem)/100;
	}
	
	public void imprimir() {
		System.out.println(id + ", " + nome + ", " + salario);
	}
	

}
