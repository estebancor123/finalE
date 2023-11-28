package com.argprograma.cornejo.tpfinal1.services;


import com.argprograma.cornejo.tpfinal1.model.MedioComunicacion;
import com.argprograma.cornejo.tpfinal1.repositories.MedioComunicacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MedioComunicacionServices {
    MedioComunicacionRepository medioComunicacionRepository;
@Autowired
    public MedioComunicacionServices(MedioComunicacionRepository medioComunicacionRepository) {
        this.medioComunicacionRepository = medioComunicacionRepository;
    }

    public MedioComunicacion GuardarMedio (MedioComunicacion m){

        return medioComunicacionRepository.save(m);

    }
}
