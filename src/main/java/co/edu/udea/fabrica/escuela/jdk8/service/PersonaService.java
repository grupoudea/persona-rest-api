package co.edu.udea.fabrica.escuela.jdk8.service;

import co.edu.udea.fabrica.escuela.jdk8.model.Persona;
import co.edu.udea.fabrica.escuela.jdk8.repository.PersonaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class PersonaService {

    private PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public List<Persona> findAll() {

        List<Persona> personaList = personaRepository.findAll(); //aqui se devuelven todas las personas de la base de datos.


        return personaList;
    }

    public List<Persona> findPersonaConFiltroPromedioAcumulado(Float notaFiltro) {

        List<Persona> personaList = personaRepository.findAll(); //aqui se devuelven todas las personas de la base de datos.

        // aquí hago un filtro de todas las personas que tengan un promedio acumulado mayor que 3.5
        List<Persona> personaFiltrada =  personaList
                .stream()
                .filter(persona -> persona.getPromedioAcumulado() > notaFiltro )
                .collect(Collectors.toList());

        return personaFiltrada;
    }
}
