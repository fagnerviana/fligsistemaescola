package modelo;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

import lombok.Data;


@Data
@Embeddable
public class TurmaProfessorId implements Serializable{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long usuario;
	private Long turma;
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TurmaProfessorId other = (TurmaProfessorId) obj;
		return Objects.equals(turma, other.turma) && Objects.equals(usuario, other.usuario);
	}
	@Override
	public int hashCode() {
		return Objects.hash(turma, usuario);
	}
	
	

}
