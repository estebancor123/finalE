package com.argprograma.cornejo.tpfinal1.services;

import com.argprograma.cornejo.tpfinal1.model.Servicio;
import com.argprograma.cornejo.tpfinal1.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.argprograma.cornejo.tpfinal1.model.Cliente;

@Service
public class ClienteServices {
    ClienteRepository clienteRepository;

@Autowired
    public ClienteServices(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente Guardarcliente (Cliente c){

    return clienteRepository.save(c);

    }


}
