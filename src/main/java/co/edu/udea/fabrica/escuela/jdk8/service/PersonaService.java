package co.edu.udea.fabrica.escuela.jdk8.service;

import co.edu.udea.fabrica.escuela.jdk8.model.Persona;
import co.edu.udea.fabrica.escuela.jdk8.repository.PersonaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PersonaService {

    private PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public List<Persona> findAll() {

        List<Persona> personaList = personaRepository.findAll();


        return personaList;
    }
}
