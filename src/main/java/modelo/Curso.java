package modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;	
	private String nome;
	private double valor;
	private int cargaHorariaTotal;
	
	@ManyToMany
	@JoinTable(name="disciplina_has_curso",
	joinColumns = @JoinColumn(name="idcurso"),
	inverseJoinColumns = @JoinColumn(name="iddisciplina"))
	private List<Disciplina> disciplinas= new ArrayList<>();
	
		

}
