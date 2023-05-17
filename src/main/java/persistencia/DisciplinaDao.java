package persistencia;

import java.util.List;

import javax.persistence.EntityManager;

import modelo.Curso;
import modelo.Disciplina;
import modelo.Usuario;
import util.JpaUtil;

public class DisciplinaDao {

	private EntityManager em = JpaUtil.getEntityManager();
	
	public DisciplinaDao(){
		
	}
	
	//atender o mapeamento disciplina_has_professor
	public void saveAllDisciplinaProfessor(List<Usuario> professores) {

		em.getTransaction().begin();

		for (Usuario usuario : professores) {
			em.persist(usuario);

		}
		em.getTransaction().commit();

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

	//Retorna a disciplina pelo seu ID
	public Disciplina getById(final Integer id) {
		return em.find(Disciplina.class, id);
	}

	//Lista todas as disciplinas
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
