package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Turma implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String codigo;
	private LocalDate data;
	
	//para atender o relacionamento de n para n de Aluno x Turma 
	
	/*
	@ManyToMany
	@JoinTable(name="turma_has_aluno",
	joinColumns = @JoinColumn(name="idturma"),
	inverseJoinColumns = @JoinColumn(name="idaluno")
	)
	private List<Usuario> alunos = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name="turma_has_professor",
	joinColumns = @JoinColumn(name="idturma"),
	inverseJoinColumns = @JoinColumn(name="idprofessor")
	)
	private List<Usuario> professores = new ArrayList<>();
	*/
	
		

}