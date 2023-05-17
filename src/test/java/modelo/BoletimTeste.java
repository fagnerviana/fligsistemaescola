package modelo;

import org.junit.Test;

import modelo.enums.TipoResultado;
import persistencia.BoletimDao;
import persistencia.UsuarioDao;

public class BoletimTeste {

	
	public Usuario aluno = new Usuario();
	public UsuarioDao alunoDao = new UsuarioDao();
	public Boletim bo = new Boletim();
	public BoletimDao boDao = new BoletimDao();
	
	
	@Test
	public void salvarBoletim() {
		aluno = alunoDao.getById(9);
		bo.setFaltas(5);
		bo.setAluno(aluno);
		bo.setNotas_media(7.5);
		bo.setResultado_final(TipoResultado.APROVADO);
		
		boDao.SalvarBoletim(bo);
		
	}

}
