package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


public class Avaliacao {
	
	
	private int id;
	private String nome;
	private double notaProva;
	private Disciplina disciplina;
		

}
