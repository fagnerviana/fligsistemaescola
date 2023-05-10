package modelo;


import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import modelo.Embeddable.BoletimEmbeddable;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Boletim implements Serializable{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Atender as duas chaves primárias foi criado a classe BoletimEmbeddable
	@EmbeddedId
	private BoletimEmbeddable id;
	
	private int faltas;	
	private double notas_media;
	private double resultado_final;
	

}
