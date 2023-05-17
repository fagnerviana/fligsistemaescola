package persistencia;

import java.util.List;

import javax.persistence.EntityManager;

import modelo.AvaliacaoTurmaAluno;
import util.JpaUtil;

public class AvaliacaoTurmaAlunoDao {

	private EntityManager em = JpaUtil.getEntityManager();
	
	public AvaliacaoTurmaAlunoDao(){
		
	}
	
	
	//Implemtar a media conforme a avaliação o aluno 
	public double MediaAluno(AvaliacaoTurmaAluno avaliacaoTurmaAluno) {
		
	   return 0;	
	}
	
	
	public void SalvarAvaliacaoTurmaAluno(AvaliacaoTurmaAluno avaliacaoTurmaAluno) {

		try {
			em.getTransaction().begin();
			em.persist(avaliacaoTurmaAluno);
			em.getTransaction().commit();
			em.close();

		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}

	}

	// Retorna o usuario conforme o seu ID
	public AvaliacaoTurmaAluno getById(final AvaliacaoTurmaAluno id) {
		return em.find(AvaliacaoTurmaAluno.class, id);
	}

	// Tras a lista de cursos
	@SuppressWarnings("unchecked")
	public List<AvaliacaoTurmaAluno> findAll() {
		return em.createQuery("FROM " + AvaliacaoTurmaAluno.class.getName()).getResultList();
	}

	public void Update(AvaliacaoTurmaAluno avaliacaoTurmaAluno) {
		try {
			em.getTransaction().begin();
			em.merge(avaliacaoTurmaAluno);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	public void remove(AvaliacaoTurmaAluno avaliacaoTurmaAluno) {
		try {
			em.getTransaction().begin();
			avaliacaoTurmaAluno = em.find(AvaliacaoTurmaAluno.class, avaliacaoTurmaAluno.getId());
			em.remove(avaliacaoTurmaAluno);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	
}
