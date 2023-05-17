package modelo.Embeddable;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Embeddable
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="avaliacao_turma_aluno")
public class AvaliacaoTurmaAlunoId implements Serializable{
	
	@Column(name = "idaluno")
	private Integer idaluno;
	
	@Column(name = "idavaliacao")
	private Integer idavaliacao;
	
	@Column(name = "idturma")
	private Integer idturma;


}
