package com.examen.DAW_CL2_MARCO_ARANDA.model.bd;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
    @Getter
    @Setter
    @Entity
    @Table(name = "Especialidad")
    public class Especialidad {
        @Id
        private String idesp;

        @Column(name="nomesp")
        private String nomesp;

        @Column(name="costo")
        private Double costo;

        @JsonBackReference
        @OneToMany(mappedBy = "especialidad",
        cascade = CascadeType.ALL, orphanRemoval = true)
        private List<Alumno> listaalumno = new ArrayList<>();

}
