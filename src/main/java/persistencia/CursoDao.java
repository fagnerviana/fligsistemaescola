package persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import modelo.Curso;

public interface CursoDao extends JpaRepository<Curso, Integer> {
	
	
}
