package modelo;

import org.junit.Test;
import persistencia.CursoDao;
public class CursoTeste {

	public Curso curso = new Curso();
	public CursoDao dao = new CursoDao();
	
	//removeCurso - Teste Realizado - ok -  12/05/2023 - Fagner - OBS - o teste foi realizado sem o mapeamento de Curso x Disciplina
	//@Test
	public void removeCurso() {
		curso = dao.getById(3);
		
		dao.remove(curso);
		
	}
	
	//remove - Teste Realizado - ok -  12/05/2023 - Fagner - OBS - o teste foi realizado sem o mapeamento de Curso x Disciplina
	//@Test
	public void removeById() {
		dao.removeById(2);
	}
	
	//finDall - Teste Realizado - ok -  12/05/2023 - Fagner - OBS - o teste foi realizado sem o mapeamento de Curso x Disciplina
	//@Test
	public void findAll() {
		 
		 System.out.println(dao.findAll());
	
	}
		
	//SalvarCurso - Teste Realizado - ok -  12/05/2023 - Fagner 
	//@Test 
	public void salvarCurso() {
	 
	 curso.setNome("6ª B"); 
	 curso.setValor(300);
	 curso.setCargaHorariaTotal(380); 
	 dao.SalvarCurso(curso); }
	
	
	//getById - Teste Realizado - ok -  12/05/2023 - Fagner - OBS - o teste foi realizado sem o mapeamento de Curso x Disciplina
	//@Test
	public void getById() {
		curso=dao.getById(2);
		System.out.println(curso);						
	}
	
	@Test
		public void updateCurso() {
			curso=dao.getById(5);
			curso.setNome("6ª Serie");
			dao.Update(curso);
			System.out.println(curso.getNome());						
		}
		
	

}
