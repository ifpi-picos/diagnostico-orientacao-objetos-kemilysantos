package aula;


public abstract class Funcionario {
	private String nome;
	protected float salario;
	private String[] beneficios;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String[] getBeneficios() {
		return beneficios;
	}
	public void setBeneficios(String[] beneficios) {
		this.beneficios = beneficios;
	}
}
