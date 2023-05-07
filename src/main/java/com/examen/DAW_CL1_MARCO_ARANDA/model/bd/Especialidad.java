package com.examen.DAW_CL1_MARCO_ARANDA.model.bd;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


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
}
