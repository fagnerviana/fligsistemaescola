package application;

import modelo.TipoUsuario;
import modelo.Usuario;

public class Teste {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Usuario usuario = new Usuario();
		usuario.setNome("Fagner");
		usuario.setLogin("Email@email");
		usuario.setSenha("123456789");
		usuario.setTipoUsuario(TipoUsuario.Professor);
		
		
		
		
		//Chama toda a configuração
		/*
		 * EntityManagerFactory emf =
		 * Persistence.createEntityManagerFactory("flig-jpa"); EntityManager em =
		 * emf.createEntityManager();
		 * 
		 * 
		 * em.getTransaction().begin(); //Persist metodo para salvar no banco de dados
		 * em.persist(Usuario.builder()
		 * 
		 * .nome("Teste2")
		 * 
		 * .login("email@email")
		 * 
		 * .senha("123456789")
		 * 
		 * .tipoUsuario(TipoUsuario.Professor) .build()); em.getTransaction().commit();
		 */
		 
	
				
	}

}
