package co.edu.udea.fabrica.escuela.jdk8.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "persona")
@Data
public class Persona {

    @Id
    @Column(name = "id_persona")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPersona;

    private String nombre;

    @Column(unique = true, name = "identificacion")
    private String identificacion;

    private Integer edad;

    private Integer cantidadMaterias;

    private Float promedioAcumulado;

    private LocalDate fechaIngreso;

    private String ciudadResidencia;

    public Persona(){}
}
