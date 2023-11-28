package com.argprograma.cornejo.tpfinal1.model;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data

@Entity
@Table(name="cliente")
@AllArgsConstructor
public class Cliente {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    private String nombre;
	    private String apellido;
	    private String email;
	    private String cuit;
	    private String razonSocial;
	    private List<Servicio> serviciosContratados;


}
