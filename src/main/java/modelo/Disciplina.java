package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Disciplina implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private int cargaHoraria;

	//Aqui vai atender o relacionamento de muitos para um Disciplina x professor
	@ManyToOne
	@JoinColumn(name="idprofessor")
	private Usuario usuario;
	
	
	//Aqui vai atender o relacionamento de muitos para muitos disciplina_has_curso
	@ManyToMany(mappedBy = "disciplinas")
	private List<Curso> cursos = new ArrayList<>();
	
	//Aqui vai atender o relacionamento de muitos para um Disciplina x Avaliação
	@OneToMany(mappedBy="disciplina")
	private List<Avaliacao> avaliacao = new ArrayList<>();
	
	
	
	
	
	
}
