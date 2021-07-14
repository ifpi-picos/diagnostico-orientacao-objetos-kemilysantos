package aula;

public class PF extends Funcionario {
	private String cpf;
	public String[] beneficios;

	public PF(String nome, String cpf) {
		this.setNome(nome);
		this.setSalario(salario);
		this.cpf = cpf;
		String[] beneficios = {"Plano de saude", "vr", "ferias"};
		this.setBeneficios(beneficios);
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	


	public float getSalarioLiquido() {
		return (float) (this.getSalario() - (getSalario() * 0.1));
		
		
	}



	


	
}
