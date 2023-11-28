package com.argprograma.cornejo.tpfinal1.model;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name="medioComunicacion")
@AllArgsConstructor
public class MedioComunicacion {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	 	private MedioEnum medio;
	 	private String contacto;
	 	@ManyToOne
	    @JoinColumn(name = "id_tecnico", referencedColumnName = "id")
	    private tecnico tecnico;
}
