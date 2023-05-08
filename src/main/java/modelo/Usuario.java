package modelo;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import modelo.enums.TipoUsuario;

@Entity
@Data
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
	
	//Atender n para n de turmas
	@ManyToMany(mappedBy = "alunos")
	private List<Turma> turmas = new ArrayList<>();
	
		
	
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
