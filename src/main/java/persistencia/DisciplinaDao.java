package persistencia;

import java.util.List;

import javax.persistence.EntityManager;

import modelo.Curso;
import modelo.Disciplina;
import util.JpaUtil;

public class DisciplinaDao {

	private EntityManager em = JpaUtil.getEntityManager();
	
	public DisciplinaDao(){
		
	}
	
	
	public void saveAllCursos(List<Curso> cursos) {

		em.getTransaction().begin();

		for (Curso curso : cursos) {
			em.persist(curso);

		}
		em.getTransaction().commit();

	}

	public void SalvarDisciplina(Disciplina disciplina) {

		try {
			em.getTransaction().begin();
			em.persist(disciplina);
			em.getTransaction().commit();
			em.close();

		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}

	}

	// Retorna o usuario conforme o seu ID
	public Disciplina getById(final Integer id) {
		return em.find(Disciplina.class, id);
	}

	// Tras a lista de usuarios
	@SuppressWarnings("unchecked")
	public List<Disciplina> findAll() {
		return em.createQuery("FROM " + Disciplina.class.getName()).getResultList();
	}

	public void Update(Disciplina disciplina) {
		try {
			em.getTransaction().begin();
			em.merge(disciplina);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	public void remove(Disciplina disciplina) {
		try {
			em.getTransaction().begin();
			disciplina = em.find(Disciplina.class, disciplina.getId());
			em.remove(disciplina);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	public void removeById(final Integer id) {
		try {
			Disciplina disciplina = getById(id);
			remove(disciplina);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
