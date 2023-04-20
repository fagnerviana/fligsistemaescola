package modelo;

import lombok.Data;

@Data
public class Avaliacao {
	
	private int id;
	private String nome;
	private double notaProva;
	private Disciplina disciplina;
		

}
