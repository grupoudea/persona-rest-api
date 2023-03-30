package co.edu.udea.fabrica.escuela.jdk8.repository;

import co.edu.udea.fabrica.escuela.jdk8.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {
}
