package com.argprograma.cornejo.tpfinal1.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@Table(name="tipoProblema")
@AllArgsConstructor
public class TipoProblema {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    private String tipo;
	    private int tiempoEstimado;
	    private int tiempomax;
	    @ManyToOne
	    @JoinColumn(name = "id_especialidad", referencedColumnName = "id")
	    private Especialidad especialidad;
	    
}
