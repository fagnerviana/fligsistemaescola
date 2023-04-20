package modelo;

import java.util.List;

import lombok.Data;

@Data
public class Disciplina {
	
	private int id;
	private String nome;
	private List<Usuario> ususario;
	
}
