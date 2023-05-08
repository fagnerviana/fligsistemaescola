package persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import modelo.Turma;
import modelo.Usuario;
import util.JpaUtil;

public class UsuarioDao {

	private EntityManager em = JpaUtil.getEntityManager();

	public UsuarioDao() {

	}

	// Esta função esta funcionando Retorna o nome do usuario ou null
	public Usuario validarLogin(String login, String senha) {
		Query query = em.createQuery("SELECT u FROM Usuario u WHERE u.login = :login AND u.senha = :senha");
		query.setParameter("login", login);
		query.setParameter("senha", senha);
		try {
			Usuario usuario = (Usuario) query.getSingleResult();
			return usuario;
		} catch (NoResultException e) {
			return null;
		}
	}

	public void saveAllTurma(List<Turma> turmas) {

		em.getTransaction().begin();

		for (Turma turma : turmas) {
			em.persist(turma);

		}
		em.getTransaction().commit();

	}

	public void SalvarUsuario(Usuario usuario) {

		try {
			em.getTransaction().begin();
			em.persist(usuario);
			em.getTransaction().commit();
			em.close();

		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}

	}

	public Usuario getById(final Integer id) {
		return em.find(Usuario.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Usuario> findAll() {
		return em.createQuery("FROM " + Usuario.class.getName()).getResultList();
	}

	public void Update(Usuario usuario) {
		try {
			em.getTransaction().begin();
			em.merge(usuario);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	public void remove(Usuario usuario) {
		try {
			em.getTransaction().begin();
			usuario = em.find(Usuario.class, usuario.getId());
			em.remove(usuario);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	public void removeById(final Integer id) {
		try {
			Usuario usuario = getById(id);
			remove(usuario);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
