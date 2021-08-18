package agregacao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	private String nome;
	public List<Disciplina>disciplinas;
	
	public Curso(String nome) {
		this.nome = nome;
		this.disciplinas = new ArrayList<Disciplina>();
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void removeDisciplina(Disciplina disciplinas) {
		this.disciplinas.remove(disciplinas);
	}
	public void adicionaDisciplina(Disciplina disciplinas) {
		this.disciplinas.add(disciplinas);
	}
	public Disciplina getDisciplina(int index) {
		return this.disciplinas.get(index);
	}
}


