package co.edu.udea.fabrica.escuela.jdk8.controller;

import co.edu.udea.fabrica.escuela.jdk8.model.Persona;
import co.edu.udea.fabrica.escuela.jdk8.service.PersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    private final Logger log = LoggerFactory.getLogger(PersonaController.class);

    private PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/obtener-todos")
    public ResponseEntity<List<Persona>> findAll() {
        List<Persona> personaList = personaService.findAll();
        return ResponseEntity.ok(personaList);
    }

    @GetMapping("/filtro-promedio-acumulado")
    public ResponseEntity<List<Persona>> findPersonasFiltroPromedioAcumulado(@RequestParam("nota") String notaFiltro) {
        List<Persona> personaList = personaService.findPersonaConFiltroPromedioAcumulado(Float.valueOf(notaFiltro));
        return ResponseEntity.ok(personaList);
    }

}
