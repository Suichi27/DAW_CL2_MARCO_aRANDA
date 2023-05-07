package com.examen.DAW_CL1_MARCO_ARANDA.repository;

import com.examen.DAW_CL1_MARCO_ARANDA.model.bd.Especialidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecialidadRepository extends JpaRepository<Especialidad,String> {
}
