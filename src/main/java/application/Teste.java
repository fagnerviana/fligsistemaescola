package application;

import java.util.Arrays;



import modelo.Curso;
import modelo.Disciplina;
import persistencia.CursoDao;
import persistencia.DisciplinaDao;

public class Teste {

	public static void main(String[] args) throws ClassNotFoundException {
		
			
		
		/*
		AvaliacaoTurmaAlunoId ata = new AvaliacaoTurmaAlunoId();
		ata.setIdaluno(3);
		ata.setIdavaliacao(3);
		ata.setIdturma(1);
		
		AvaliacaoTurmaAluno avt1 = new AvaliacaoTurmaAluno();
		avt1.setId(ata);
		avt1.setResultado(8);
		
		AvaliacaoTurmaAlunoDao dao = new AvaliacaoTurmaAlunoDao();
		dao.SalvarAvaliacaoTurmaAluno(avt1);
		
		
		
		BoletimEmbeddable boId = new BoletimEmbeddable();
		boId.setIdaluno(3);
		boId.setIdturma(1);
		
		BoletimDao daob =  new BoletimDao();
		Boletim bo = new Boletim();
		bo.setId(boId);
		bo.setFaltas(5);
		bo.setNotas_media(6); 
		bo.setResultado_final(7);
		daob.SalvarBoletim(bo);
		*/
			
		/*
		DisciplinaDao dao = new DisciplinaDao();
		Avaliacao av1 = new Avaliacao();
		AvaliacaoDao avdao = new AvaliacaoDao();
		
		av1.setNome("Avalicao 2");
		av1.setDisciplina(dao.getById(2));
		av1.setNotaProva(10);
		avdao.SalvarAvaliacao(av1);;
		
		*/
		 
		
		/*
		UsuarioDao dao = new UsuarioDao();
		DisciplinaDao ddao = new DisciplinaDao();
		
		Disciplina d1 = new Disciplina();
		d1.setNome("JavaScript");
		d1.setUsuario(dao.getById(1));
		d1.setCargaHoraria(60);
		
		ddao.SalvarDisciplina(d1);
		*/
		
		
		
		
		/*
		//Criando os objetos Alunos e Professores		
		Usuario aluno1 = new Usuario();
		Usuario aluno2 = new Usuario();
		
		Usuario prof1 = new Usuario();
		Usuario prof2 = new Usuario();
		
		
		UsuarioDao dao =  new UsuarioDao();
		aluno1=dao.getById(3);
		aluno2 =dao.getById(6);
		prof1=dao.getById(2);
		prof2=dao.getById(7);
		
		
		Turma turma1 = new Turma();
		Turma turma2 = new Turma();
		
				
		TurmaDao tdao = new TurmaDao();
		turma1 = tdao.getById(1);
		turma2 = tdao.getById(2);
		
		
		//aluno1.getTurmas().addAll(Arrays.asList(turma1));
		//aluno2.getTurmas().addAll(Arrays.asList(turma1));
				
		//turma1.getAlunos().addAll(Arrays.asList(aluno1));
		//turma2.getAlunos().addAll(Arrays.asList(aluno2));
		turma1.getProfessores().addAll(Arrays.asList(prof1));
		turma2.getProfessores().addAll(Arrays.asList(prof2));
		
		//aluno1.getTurmas().addAll(Arrays.asList(turma1));
		//aluno2.getTurmas().addAll(Arrays.asList(turma1));		
		
		//Retorna 
		prof1.getTurmas().addAll(Arrays.asList(turma1));
		prof2.getTurmas().addAll(Arrays.asList(turma2));
		
		
		dao.saveAllTurma(Arrays.asList(turma1,turma2));
		tdao.saveAllUsuario(Arrays.asList(prof1,prof2));
		*/		
		
	}
	
}
