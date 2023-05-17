package modelo;

import java.util.Arrays;

import org.junit.Test;

import persistencia.TurmaDao;
import persistencia.UsuarioDao;

public class Turma_has_AlunoTeste {
	
	public Usuario aluno = new Usuario();
	public Turma turma = new Turma();
	public UsuarioDao alunoDao = new UsuarioDao();
	public TurmaDao tDao= new TurmaDao();

	
	//Realizado Teste- ok 16/05/2023 Fagner
	@Test
	public void salvarProfessorTurma() {
		aluno = alunoDao.getById(12);
		turma = tDao.getById(2);
		
		aluno.getTurmas().addAll(Arrays.asList(turma));
		turma.getAlunos().addAll(Arrays.asList(aluno));
		
		alunoDao.saveAllTurma(aluno.getTurmas());
		tDao.saveAllUsuario(turma.getAlunos());
		
	}

}
