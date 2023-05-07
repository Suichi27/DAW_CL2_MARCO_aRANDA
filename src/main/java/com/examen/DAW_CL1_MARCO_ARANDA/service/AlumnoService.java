package com.examen.DAW_CL1_MARCO_ARANDA.service;

import com.examen.DAW_CL1_MARCO_ARANDA.model.bd.Alumno;
import com.examen.DAW_CL1_MARCO_ARANDA.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    public List<Alumno> listarAlumno(){
        return alumnoRepository.findAll();
    }

    public void registrarAlumno(Alumno alumno) {alumnoRepository.save(alumno);}

    public void eliminarAlumno(String idAlumno){alumnoRepository.deleteById(idAlumno);}





}
