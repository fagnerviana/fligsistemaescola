package persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import modelo.Boletim;
import modelo.Embeddable.BoletimEmbeddable;
import util.JpaUtil;

public class BoletimDao {

	private EntityManager em = JpaUtil.getEntityManager();
	public BoletimDao(){
		
	}
	
	
	public void SalvarBoletim(Boletim boletim) {

		try {
			em.getTransaction().begin();
			em.persist(boletim);
			em.getTransaction().commit();
			em.close();

		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}

	}

	// Retorna o usuario conforme o seu ID
	public Boletim getById(final BoletimEmbeddable id) {
		return em.find(Boletim.class, id);
	}

	// Tras a lista de cursos
	@SuppressWarnings("unchecked")
	public List<Boletim> findAll() {
		return em.createQuery("FROM " + Boletim.class.getName()).getResultList();
	}

	public void Update(Boletim boletim) {
		try {
			em.getTransaction().begin();
			em.merge(boletim);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	public void remove(Boletim boletim) {
		try {
			em.getTransaction().begin();
			boletim = em.find(Boletim.class, boletim.getId());
			em.remove(boletim);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	/*
	public void removeById(final Integer id) {
		try {
			Boletim boletim = getById(id);
			remove(boletim);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	*/

}
