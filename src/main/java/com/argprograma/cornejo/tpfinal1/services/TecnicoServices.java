package com.argprograma.cornejo.tpfinal1.services;

import com.argprograma.cornejo.tpfinal1.model.tecnico;
import com.argprograma.cornejo.tpfinal1.repositories.tecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TecnicoServices {
    tecnicoRepository tecnicoRepository;
@Autowired
    public TecnicoServices(com.argprograma.cornejo.tpfinal1.repositories.tecnicoRepository tecnicoRepository) {
        this.tecnicoRepository = tecnicoRepository;
    }
    public tecnico GuardarTecnico (tecnico c){

        return tecnicoRepository.save(c);

    }
}
