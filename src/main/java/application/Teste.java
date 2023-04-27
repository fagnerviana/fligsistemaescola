package application;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Turma;

public class Teste {

	public static void main(String[] args) throws ClassNotFoundException {

			LocalDate dt01=LocalDate.of(2023, 03, 01);
		  //Chama toda a configuração
		  
		  EntityManagerFactory emf = Persistence.createEntityManagerFactory("flig-jpa"); 
		  EntityManager em = emf.createEntityManager();
		  
		  
		  em.getTransaction().begin(); //Persist metodo para salvar no banco de dados
		  em.persist(Turma.builder()		  
		  .codigo("5ªA")
		  .data(dt01)
		  .build());
		  em.getTransaction().commit();
		  
		 

	}

}
