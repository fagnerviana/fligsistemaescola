package modelo;

import org.junit.Test;

import persistencia.DisciplinaDao;
import persistencia.UsuarioDao;

public class DisciplinaTeste {

	public DisciplinaDao dao = new DisciplinaDao();
	public Disciplina disciplina = new Disciplina();
	public UsuarioDao userdao = new UsuarioDao();
	public Usuario user = new Usuario();
	
	
	@Test
	public void salvarDisciplina() {
		user = userdao.getById(4);
		disciplina.setNome("Portugues");
		disciplina.setUsuario(user);
		disciplina.setCargaHoraria(340);
		dao.SalvarDisciplina(disciplina);
		
		}

}
