package com.argprograma.cornejo.tpfinal1.services;

import com.argprograma.cornejo.tpfinal1.model.TipoProblema;
import com.argprograma.cornejo.tpfinal1.repositories.TipoProblemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TipoProblemaServices {
    TipoProblemaRepository tipoProblemaRepository;
@Autowired
    public TipoProblemaServices(TipoProblemaRepository tipoProblemaRepository) {
        this.tipoProblemaRepository = tipoProblemaRepository;
    }
    public TipoProblema GuardarProblema (TipoProblema c){

        return tipoProblemaRepository.save(c);

    }
}
