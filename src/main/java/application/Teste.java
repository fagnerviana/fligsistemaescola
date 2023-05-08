package application;

import java.util.Arrays;

import modelo.Turma;
import modelo.Usuario;
import persistencia.TurmaDao;
import persistencia.UsuarioDao;

public class Teste {

	public static void main(String[] args) throws ClassNotFoundException {
		Usuario aluno1 = new Usuario();
		Usuario aluno2 = new Usuario();
		
		UsuarioDao dao =  new UsuarioDao();
		aluno1=dao.getById(3);
		aluno2 =dao.getById(6);
		
		System.out.println(aluno1.getNome());
		System.out.println(aluno2.getNome());
		
		Turma turma1 = new Turma();
		Turma turma2 = new Turma();
		
				
		TurmaDao tdao = new TurmaDao();
		turma1 = tdao.getById(1);
		turma2 = tdao.getById(2);
		
		System.out.println(turma1.getCodigo());
		System.out.println(turma2.getCodigo());
		
		turma1.getAlunos().addAll(Arrays.asList(aluno1));
		turma2.getAlunos().addAll(Arrays.asList(aluno2));		
		
		aluno1.getTurmas().addAll(Arrays.asList(turma1));
		aluno2.getTurmas().addAll(Arrays.asList(turma1));
		
		
		
		dao.saveAllTurma(Arrays.asList(turma1,turma2));
		tdao.saveAllUsuario(Arrays.asList(aluno1,aluno2));
		
		
	}

}
