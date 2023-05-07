package com.examen.DAW_CL1_MARCO_ARANDA.service;

import com.examen.DAW_CL1_MARCO_ARANDA.model.bd.Especialidad;
import com.examen.DAW_CL1_MARCO_ARANDA.repository.EspecialidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspecialidadService {
    @Autowired
    private EspecialidadRepository especialidadRepository;

    public List<Especialidad> listarEspecialidad() {return especialidadRepository.findAll();}

}
