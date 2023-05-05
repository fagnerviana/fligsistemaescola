package modelo;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import modelo.enums.TipoUsuario;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Usuario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String senha;
	private String login;
	@Enumerated(EnumType.STRING)
	private TipoUsuario tipoUsuario;
	
	
	
	//Validar senha e login
	public Usuario(String senha, String login) {
		this.senha = senha;
		this.login = login;
	}
	
	
	
	
	
	/*
	@ManyToMany
	@JoinTable(name="turma_has_professor",
	joinColumns = @JoinColumn(name="idprofessor"),
	inverseJoinColumns = @JoinColumn(name="idturma"))
	private List<Turma> listaTurma = new ArrayList();
	*/
}
