package modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import persistencia.CursoDao;
import persistencia.DisciplinaDao;

public class Disciplina_has_CursoTeste {

	public DisciplinaDao ddao = new DisciplinaDao();
	public CursoDao cdao=new CursoDao();
	public Disciplina d1,d2,d3,d4,d5 = new Disciplina();
	public Curso c1,c2= new Curso();
	
	
	//Teste Realizado ok  15/05 - Fagner 
	@Test
	public void salvarDisciplinasCurso() {
				
		d1 = ddao.getById(1); //portugues
		d2 =ddao.getById(2);//matematica
		d3=ddao.getById(3);//geografia
		d4=ddao.getById(6);//historia
		d5=ddao.getById(4);//Quimica
		c1 = cdao.getById(1);//5ªA
		c2 = cdao.getById(5);//6ªB
		d1.getCursos().addAll(Arrays.asList(c1,c2));
		d2.getCursos().addAll(Arrays.asList(c1,c2));
		d3.getCursos().addAll(Arrays.asList(c1,c2));
		d4.getCursos().addAll(Arrays.asList(c1,c2));
		d5.getCursos().add(c2);
		
		c1.getDisciplinas().addAll(Arrays.asList(d1,d2,d3,d4));
		c2.getDisciplinas().addAll(Arrays.asList(d1,d2,d3,d4,d5));
		
		ddao.saveAllCursos(Arrays.asList(c1,c2));
		cdao.saveAllDisciplinas(Arrays.asList(d1,d2,d3,d4,d5));		
		
	}
	
	

}
