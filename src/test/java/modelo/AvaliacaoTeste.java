package modelo;

import java.util.List;

import org.junit.Test;

import persistencia.AvaliacaoDao;
import persistencia.DisciplinaDao;

public class AvaliacaoTeste {

	public Avaliacao av1 = new Avaliacao();
	public AvaliacaoDao dao = new AvaliacaoDao();
	public Disciplina disciplina = new Disciplina();
	public DisciplinaDao ddao = new DisciplinaDao();
	
	
	//Teste Realizado OK - 15/05/2023 Fagner
	//@Test
	public void salvarAvaliacao() {
		disciplina = ddao.getById(4);//Portugues
		
		av1.setNome("Teste");
		av1.setNotaProva(10);
		av1.setDisciplina(disciplina);
		
		dao.SalvarAvaliacao(av1);
		
	}
	//Teste Realizado falha - 16/05/2023 Fagner
	@Test
	public void findAvaliacao() {
		List<Avaliacao> listav= dao.findAll();
		
		for (Avaliacao av : listav) {
			System.out.println("Nome: "+av.getNome()+" Disciplina: " + av.getDisciplina().getNome()+"Valor da prova "+av.getNotaProva());
			
		}
		
	}	

}
