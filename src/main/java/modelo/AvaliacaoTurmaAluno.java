package modelo;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import modelo.Embeddable.AvaliacaoTurmaAlunoId;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="avaliacao_turma_aluno")
public class AvaliacaoTurmaAluno implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private AvaliacaoTurmaAlunoId id;
	
	private double resultado;
	
	
	
	

}
