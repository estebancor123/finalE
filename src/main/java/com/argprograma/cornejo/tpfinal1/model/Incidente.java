package com.argprograma.cornejo.tpfinal1.model;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;



@Entity
@Table(name = "incidente")
@Data
@AllArgsConstructor
public class Incidente {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate fecha;
    private String titulo;
    private String descripcion;
    private LocalDate fechaIngreso;
    private LocalDate fechaEstimadaResolucion;
    private LocalDate fechaResolucion;
    private EstadoEnum estado;
    private String consideraciones;
    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "id_tipoProblema", referencedColumnName = "id")
    private TipoProblema tipoProblema;
    private Servicio servicio;
    @ManyToOne
    @JoinColumn(name = "id_especialidad", referencedColumnName = "id")
    private Especialidad especialidad;
    @ManyToOne
    @JoinColumn(name = "id_tecnico", referencedColumnName = "id")
    private tecnico tecnico;
    
}
