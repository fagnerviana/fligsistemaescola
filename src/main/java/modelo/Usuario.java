package modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String senha;
	private String login;
	@Enumerated(EnumType.STRING)
	private TipoUsuario tipoUsuario;
	
	
	@ManyToMany
	@JoinTable(name="turma_has_professor",
	joinColumns = @JoinColumn(name="idprofessor"),
	inverseJoinColumns = @JoinColumn(name="idturma"))
	private List<Turma> listaTurma = new ArrayList();
	
}
