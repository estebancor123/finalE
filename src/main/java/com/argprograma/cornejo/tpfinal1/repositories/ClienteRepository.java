package com.argprograma.cornejo.tpfinal1.repositories;


import com.argprograma.cornejo.tpfinal1.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
