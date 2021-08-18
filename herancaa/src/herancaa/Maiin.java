package herancaa;

public class Maiin {

	public static void main(String[] args) {
		Empresa empresa = new Empresa(null);
		
		
		
		
		empresa.setNome("google");
		
		PF joao = new PF("João");
		joao.setNome("Joao");
		joao.setCpf("45589755");
		joao.setSalario(3000);
	
		
	
		PJ michel = new PJ("michel");
		michel.setNome("michel");	
		michel.setCnpj("566484658542654");
		michel.setSalario(3500);
		
		
		
		
		
		System.out.println("Empresa: " + empresa.getNome());
		
		System.out.println("\n");
		
		System.out.println("PF: " + joao.getNome());
		System.out.println("CPF: " + joao.getCpf());
		System.out.println("Salario: " + joao.getSalarioLiquido());
		System.out.println("Beneficios: "  );
		
		for (String beneficios : joao.getBeneficios()) {
			System.out.println(beneficios);
		}
		
		System.out.println("\n");
		System.out.println("PJ: " + michel.getNome());
		System.out.println("CNPJ: " + michel.getCnpj());
		System.out.println("Salario: " + michel.getSalarioLiquido());
		System.out.println("Beneficios: " );
		
		for (String beneficios : michel.getBeneficios()) {
			System.out.println(beneficios);
		}

}
	}


