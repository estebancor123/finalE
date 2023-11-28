package com.argprograma.cornejo.tpfinal1.services;


import com.argprograma.cornejo.tpfinal1.model.Especialidad;
import com.argprograma.cornejo.tpfinal1.repositories.EspecialidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EspecialidadServices {
    EspecialidadRepository especialidadRepository;
@Autowired
    public EspecialidadServices(EspecialidadRepository especialidadRepository) {
        this.especialidadRepository = especialidadRepository;
    }

    public Especialidad GuardarEspecialidad (Especialidad e){

        return especialidadRepository.save(e);

    }
}
