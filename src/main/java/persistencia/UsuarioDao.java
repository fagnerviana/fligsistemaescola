package persistencia;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import modelo.Turma;
import modelo.Usuario;
import modelo.enums.TipoUsuario;
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
	
	//Retorna o usuario conforme o seu ID
	public Usuario getById(final Integer id) {
		return em.find(Usuario.class, id);
	}

	//Tras a lista de usuarios
	@SuppressWarnings("unchecked")
	public List<Usuario> findAll() {
		return em.createQuery("FROM " + Usuario.class.getName()).getResultList();
	}
	
	public List<Usuario> findAllAlunos(String tipo) {
		
		String jpql = "SELECT u FROM usuario u WHERE u.tipousuario = :tipo";
	    List<Usuario> result = em
	        .createQuery(jpql, Usuario.class)
	        .setParameter("valor", tipo)
	        .getResultList();
	    return result;
	}
	

	public List<Usuario> findAllPorTipo(String tipo) {
		
		List<Usuario> user =em.createQuery("FROM " + Usuario.class.getName()).getResultList();
		List<Usuario> professor = new ArrayList<>();
		for (Usuario usuario : user) {
			if(usuario.getTipoUsuario().toString() ==tipo) {
				professor.add(usuario);
			}
			
		}
		
		return professor;
		
		
		/*
		String jpql = "SELECT u FROM usuario u WHERE u.tipousuario = :tipo";
	    TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
	    query.setParameter("tipousuario", tipo);
	    return query.getResultList();
	    */
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
