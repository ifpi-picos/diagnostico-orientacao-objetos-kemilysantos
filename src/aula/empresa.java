package aula;

import java.util.ArrayList;
import java.util.List;


public class empresa{
	private String nome;
	public List<String>funcionarios;
	

	public empresa(String nome) {
		this.setNome(nome);
		this.funcionarios = new ArrayList<String>();
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public List<String> getFuncionarios() {
		return funcionarios;
	}


	public void adicionaFuncionario() {
		this.funcionarios.addAll(funcionarios);
		
	}



}









	
