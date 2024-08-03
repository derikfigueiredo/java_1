package teste.classes;
import java.util.List;
import java.util.ArrayList;

public class Aluno {
	String nome;
	int idade;
	double media;
	
	
	private List<Disciplina> Disciplinas = new ArrayList<Disciplina>();
	
	public Aluno ( String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
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

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getMedia() {
		
		double media = 0.0;
		double soma = 0.0;
		for(Disciplina disciplina : Disciplinas) {
			soma = soma + disciplina.getNota();
			
		}
		
		media = soma / Disciplinas.size();
		return media;
	}


	public List<Disciplina> getDisciplinas() {
		return Disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		Disciplinas = disciplinas;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", media=" + media + ", Disciplinas=" + Disciplinas + "]";
	}

	
	
	
	
}