package herancaa;

public class PF extends Funcionario{
	private String cpf;

	public PF(String cpf) {
		this.cpf = cpf;
		String[] beneficios = {"Plano de saude", "vr", "ferias"};
		super.setBeneficios(beneficios);
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
