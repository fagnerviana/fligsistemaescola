package modelo;

import lombok.Data;

@Data
public class Usuario {
	
	private int id;
	private String nome;
	private String senha;
	private String login;
	private TipoUsuario tipoUsuario;
	 
	
	

}
