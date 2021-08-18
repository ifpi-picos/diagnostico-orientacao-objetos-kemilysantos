package herancaa;

public class PJ extends Funcionario{
	private String cnpj;

	public PJ(String cnpj) {
		this.cnpj = cnpj;
		String[] beneficios = {"Plano de saude"};
		super.setBeneficios(beneficios);
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public float getSalarioLiquido() {
		return (float) (this.getSalario() - (getSalario() * 0.5));
				
	}
	
}
	
