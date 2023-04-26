package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Turma;

public class Teste {

	public static void main(String[] args) throws ClassNotFoundException {

			
		  //Chama toda a configuração
		  
		  EntityManagerFactory emf = Persistence.createEntityManagerFactory("flig-jpa"); 
		  EntityManager em = emf.createEntityManager();
		  
		  
		  em.getTransaction().begin(); //Persist metodo para salvar no banco de dados
		  em.persist(Turma.builder()		  
		  .codigo("6B")
		  .data(01-02-2023)
		  .build());
		  em.getTransaction().commit();
		  
		 

	}

}
