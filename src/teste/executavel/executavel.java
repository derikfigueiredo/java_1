package teste.executavel;
import javax.swing.JOptionPane;

import teste.classes.Aluno;
import teste.classes.Disciplina;

public class executavel {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Derik", 22);
		
		String qtd = JOptionPane.showInputDialog("Quantas Disciplinas?");
		
		for(int i = 1; i <= Integer.valueOf(qtd); i++) {
		
			Disciplina DisciplinaObj = new Disciplina();

			String Disciplina = JOptionPane.showInputDialog("Disciplina " + i);
			int Nota = Integer.valueOf(JOptionPane.showInputDialog("Nota da Disciplina " + i));
			
			DisciplinaObj.setDisciplina(Disciplina);
			DisciplinaObj.setNota(Nota);
			aluno1.getDisciplinas().add(DisciplinaObj);
			
	}
		
		System.out.println(aluno1);
		System.out.println(aluno1.getMedia());
}
}