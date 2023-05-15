package persistencia;

import java.util.List;

import javax.persistence.EntityManager;

import modelo.Curso;
import modelo.Disciplina;
import util.JpaUtil;

public class CursoDao {

	private EntityManager em = JpaUtil.getEntityManager();
	public CursoDao(){
		
	}
	
	
	public void saveAllDisciplinas(List<Disciplina> disciplinas) {

		em.getTransaction().begin();

		for (Disciplina disciplina : disciplinas) {
			em.persist(disciplina);

		}
		em.getTransaction().commit();

	}
    
	public void SalvarCurso(Curso curso) {

		try {
			em.getTransaction().begin();
			em.persist(curso);
			em.getTransaction().commit();
			em.close();

		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}

	}

	// Retorna o usuario conforme o seu ID
	public Curso getById(final Integer id) {
		return em.find(Curso.class, id);
	}

	// Tras a lista de cursos
	@SuppressWarnings("unchecked")
	public List<Curso> findAll() {
		return em.createQuery("FROM " + Curso.class.getName()).getResultList();
	}

	public void Update(Curso curso) {
		try {
			em.getTransaction().begin();
			em.merge(curso);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	public void remove(Curso curso) {
		try {
			em.getTransaction().begin();
			curso = em.find(Curso.class, curso.getId());
			em.remove(curso);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	public void removeById(final Integer id) {
		try {
			Curso curso = getById(id);
			remove(curso);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
