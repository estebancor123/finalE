package com.argprograma.cornejo.tpfinal1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.argprograma.cornejo.tpfinal1.model.Incidente;
import com.argprograma.cornejo.tpfinal1.repositories.IncidenteRepository;

@Service
public class IncidenteServices {
  IncidenteRepository incidenteRepository;

  @Autowired
public IncidenteServices(IncidenteRepository incidenteRepository) {
	
	this.incidenteRepository = incidenteRepository;
}
  public Incidente GuardarIncidente(Incidente i) {
	  
	  return incidenteRepository.save(i);
	  
  }
  
}
