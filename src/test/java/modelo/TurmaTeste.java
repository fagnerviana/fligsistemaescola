package modelo;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import persistencia.TurmaDao;

public class TurmaTeste {
	
	public TurmaDao dao = new TurmaDao();
	public Turma turma = new Turma();

	//Teste Realizado ok - 15/05/2023 Fagner 
	//@Test
	public void salvarTurma() {
		turma.setCodigo("Editar Teste");
		turma.setData(LocalDate.of(2023, 01, 10));
		dao.SalvarTurma(turma);
		
	}
	//Teste Realizado ok - 15/05/2023 Fagner	
	//@Test
	public void listarTurmas() {
		System.out.println(dao.findAll());
	}
	//Teste Realizado ok - 15/05/2023 Fagner
	//@Test
	public void excluirTurma() {
		dao.removeById(5);
		System.out.println(dao.findAll());
	}
	// Teste Realizado ok - 15/05/2023 Fagner
	@Test
	public void editarTurma() {
		turma = dao.getById(6);
		turma.setCodigo("Editado Com Sucesso");
		dao.Update(turma);
		System.out.println(dao.findAll());
	}

}
