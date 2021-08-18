package agregacao;

public class Maain {

	public static void main(String[] args) {
		Curso ads = new Curso("Ads");
		Professor nayara = new Professor("Nayara");
		Disciplina bd = new Disciplina("Banco de Dados", 80, nayara);
		
		
		ads.adicionaDisciplina(bd);
		nayara.setNome("Nayara");



		System.out.println("Curso: " + ads.getNome());
		
		for(int i=0; i < ads.getDisciplinas().size(); i++) {
			Disciplina disciplinas = ads.getDisciplinas().get(i);
			System.out.println("Disciplina:" + disciplinas.getNome()+ "\n" + "Professora: "+ nayara.getNome() + "\n" + "Ch: " + disciplinas.getCh());
		}
		
		
		
		
		
		
	}

}
