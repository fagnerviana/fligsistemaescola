package persistencia;

import java.util.List;

import javax.persistence.EntityManager;

import modelo.Avaliacao;
import modelo.Disciplina;
import util.JpaUtil;

public class AvaliacaoDao {

	private EntityManager em = JpaUtil.getEntityManager();
	
	public AvaliacaoDao(){
		
	}
	
	public void SalvarAvaliacao(Avaliacao avaliacao) {

		try {
			em.getTransaction().begin();
			em.persist(avaliacao);
			em.getTransaction().commit();
			em.close();

		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}

	}

	// Retorna o usuario conforme o seu ID
	public Avaliacao getById(final Integer id) {
		return em.find(Avaliacao.class, id);
	}

	// Tras a lista de usuarios
	@SuppressWarnings("unchecked")
	public List<Avaliacao> findAll() {
		return em.createQuery("FROM " + Avaliacao.class.getName()).getResultList();
	}

	public void Update(Avaliacao avaliacao) {
		try {
			em.getTransaction().begin();
			em.merge(avaliacao);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	public void remove(Avaliacao avaliacao) {
		try {
			em.getTransaction().begin();
			avaliacao = em.find(Avaliacao.class, avaliacao.getId());
			em.remove(avaliacao);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	public void removeById(final Integer id) {
		try {
			Avaliacao avaliacao = getById(id);
			remove(avaliacao);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
