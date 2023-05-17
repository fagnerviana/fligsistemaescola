package modelo;

import java.util.Arrays;

import org.junit.Test;

import persistencia.DisciplinaDao;
import persistencia.UsuarioDao;

public class Disciplina_has_Professor {

	public DisciplinaDao ddao = new DisciplinaDao();
	public UsuarioDao pdao = new UsuarioDao();
	public Usuario p1,p2,p3,p4,p5,p6 = new Usuario();
	public Disciplina d1,d2,d3,d4,d5,d6,d7;
	
	
	@Test
	public void buscarDisciplinaProfessor() {
		d1=ddao.getById(1);
		System.out.println(d1);
		
	}
	
	//Realizado teste - ok - 15/05/2023 - Fagner
	//@Test
	public void salvarDisciplinaProfessor() {
		p1 =pdao.getById(3);//Flavio
		p2 =pdao.getById(4);//Jean
		p3 =pdao.getById(5);//Carlo
		p4 =pdao.getById(6);//Joao Carlos
		p5 =pdao.getById(8);//Maria Agda
		p6 = pdao.getById(7);//Beto
		
		d1 = ddao.getById(1);//Portugues
		d2 = ddao.getById(2);//Matematica
		d3 = ddao.getById(3);//Geografia
		d4 = ddao.getById(4);//Quimica
		d5 = ddao.getById(5);//Fisica
		d6 = ddao.getById(6);//Historia
		d7 = ddao.getById(7);//Literatura
		
		p1.getDisciplinas().addAll(Arrays.asList(d1,d7));
		p2.getDisciplinas().addAll(Arrays.asList(d2));
		p3.getDisciplinas().addAll(Arrays.asList(d3));
		p4.getDisciplinas().addAll(Arrays.asList(d4,d5));
		p5.getDisciplinas().addAll(Arrays.asList(d6));
		p6.getDisciplinas().addAll(Arrays.asList(d7));
		
		
		d1.getProfessores().addAll(Arrays.asList(p1));
		d2.getProfessores().addAll(Arrays.asList(p2));
		d3.getProfessores().addAll(Arrays.asList(p3));
		d4.getProfessores().addAll(Arrays.asList(p4));
		d5.getProfessores().addAll(Arrays.asList(p4));
		d6.getProfessores().addAll(Arrays.asList(p5));
		d7.getProfessores().addAll(Arrays.asList(p1,p6));
		
		pdao.saveAllUsuarioDisciplina(Arrays.asList(d1,d2,d3,d4,d5,d6,d7));
		ddao.saveAllDisciplinaProfessor(Arrays.asList(p1,p2,p3,p4,p5,p6));	
		
	}

}
