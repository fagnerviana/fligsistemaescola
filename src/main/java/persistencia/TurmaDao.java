package persistencia;

import java.util.List;

import javax.persistence.EntityManager;

import modelo.Turma;
import modelo.Usuario;
import util.JpaUtil;

public class TurmaDao {

	private EntityManager em = JpaUtil.getEntityManager();

	public TurmaDao() {
				
	}
	
	
	//metodo para atender turmas_as_aluno
	public void saveAllUsuario(List<Usuario> alunos) {
		
		em.getTransaction().begin();
		
		for (Usuario usuario : alunos) {
			em.persist(usuario);
				       
		}		
		em.getTransaction().commit();
       
    }
	
	
	public void SalvarTurma(Turma turma) {
		
		try {
			em.getTransaction().begin();
			em.persist(turma);
			em.getTransaction().commit();
			em.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		
	}

	public Turma getById(final Integer id) {
        return em.find(Turma.class, id);
    }

	@SuppressWarnings("unchecked")
    public List<Turma> findAll() {
        return em.createQuery("FROM " + Turma.class.getName())
                .getResultList();
    }

	public void Update(Turma turma) {
        try {
            em.getTransaction().begin();
            em.merge(turma);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
        }
    }

	public void remove(Turma turma) {
        try {
            em.getTransaction().begin();
            turma = em.find(Turma.class, turma.getId());
            em.remove(turma);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
        }
    }

	public void removeById(final Integer id) {
        try {
            Turma turma = getById(id);
            remove(turma);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
	
	
}