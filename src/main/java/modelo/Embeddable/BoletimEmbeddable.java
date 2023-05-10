package modelo.Embeddable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import modelo.Turma;
import modelo.Usuario;

@Embeddable
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="boletim")
public class BoletimEmbeddable implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "idaluno")
	private Integer idaluno;
	
	@Column(name = "idturma")
	private Integer idturma;

	
	
	

}
