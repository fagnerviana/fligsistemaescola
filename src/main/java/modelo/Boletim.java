package modelo;


import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "Boletim")
public class Boletim {
	
	private int faltas;
	private double notas_media;
	private double resultado_final;
	

}
