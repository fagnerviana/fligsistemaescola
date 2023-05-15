package modelo;

import org.junit.Test;

import persistencia.DisciplinaDao;
import persistencia.UsuarioDao;

public class DisciplinaTeste {

	public DisciplinaDao dao = new DisciplinaDao();
	public Disciplina disciplina = new Disciplina();
	public UsuarioDao userdao = new UsuarioDao();
	public Usuario user = new Usuario();
	
	
	//@Test
	public void escluirDisciplina() {
		dao.removeById(3);
		
	}
	
	//@Test
	public void salvarDisciplina() {
		disciplina.setNome("EDITAR teste");
		disciplina.setCargaHoraria(340);
		dao.SalvarDisciplina(disciplina);
		
		}
	
	

}
