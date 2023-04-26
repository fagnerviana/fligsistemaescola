package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Curso;

public class Teste {

	public static void main(String[] args) throws ClassNotFoundException {

			
		  //Chama toda a configuração
		  
		  EntityManagerFactory emf = Persistence.createEntityManagerFactory("flig-jpa"); 
		  EntityManager em = emf.createEntityManager();
		  
		  
		  em.getTransaction().begin(); //Persist metodo para salvar no banco de dados
		  em.persist(Curso.builder()		  
		  .nome("Curso Java Back-End")
		  .cargaHorariaTotal(240)
		  .valor(500)
		  .build());
		  em.getTransaction().commit();
		  
		 

	}

}
