package modelo;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DisciplinaCurso {

	//Resolver a dupla ID
	@Id
	private int iddisciplina;
	private int idcurso;

}
