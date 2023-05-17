package modelo;

import java.util.List;

import org.junit.Test;

import modelo.Embeddable.AvaliacaoTurmaAlunoId;
import persistencia.AvaliacaoDao;
import persistencia.AvaliacaoTurmaAlunoDao;
import persistencia.TurmaDao;
import persistencia.UsuarioDao;

public class AvaliacaoTurmaAlunoTeste {

	public Usuario aluno = new Usuario();
	public UsuarioDao alunoDao = new UsuarioDao();
	public Turma turma = new Turma();
	public TurmaDao turmaDao = new TurmaDao();
	public Avaliacao av1 = new Avaliacao();
	public AvaliacaoDao avDao = new AvaliacaoDao();
	public AvaliacaoTurmaAlunoId avturmaAlunoId = new AvaliacaoTurmaAlunoId();
	public AvaliacaoTurmaAluno avturmaaluno = new AvaliacaoTurmaAluno();
	public AvaliacaoTurmaAlunoDao ataDao = new AvaliacaoTurmaAlunoDao();

	// Teste Realizado ok - 16/05/2023 Fagner
	@Test
	public void salvarAvalicaoTurmaAluno() {
		aluno = alunoDao.getById(12);
		turma = turmaDao.getById(2);
		av1 = avDao.getById(2);
		avturmaAlunoId.setIdaluno(aluno.getId());
		avturmaAlunoId.setIdturma(turma.getId());
		avturmaAlunoId.setIdavaliacao(av1.getId());
		avturmaaluno.setId(avturmaAlunoId);
		avturmaaluno.setResultado(6);
		ataDao.SalvarAvaliacaoTurmaAluno(avturmaaluno);

	}

	// Teste Realizado ok - 16/05/2023 Fagner
	// @Test
	public void findAllAVT() {

		System.out.println(ataDao.findAll());

	}

	//@Test
	public void findPorAluno() {
		
		List<AvaliacaoTurmaAluno>avturmaaluno = ataDao.findAll();
		
		for (AvaliacaoTurmaAluno avaliacaoTurmaAluno : avturmaaluno) {
			 System.out.println(avaliacaoTurmaAluno);
		}

	}

}
