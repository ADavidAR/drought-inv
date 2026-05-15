package com.company.droughtinv.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@JmixEntity
@Table(name = "ESTADOS_ALERTA", indexes = {
        @Index(name = "IDX_ESTADOS_ALERTA_LOTE", columnList = "LOTE_ID")
})
@Entity
public class EstadosAlerta {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "LOTE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Lotes lote;

    @Column(name = "DISPONIBILIDAD", nullable = false)
    @NotNull
    private String disponibilidad;

    @Column(name = "ESTADO_CADUCIDAD")
    private String estadoCaducidad;

    public EstadoCaduc getEstadoCaducidad() {
        return estadoCaducidad == null ? null : EstadoCaduc.fromId(estadoCaducidad);
    }

    public void setEstadoCaducidad(EstadoCaduc estadoCaducidad) {
        this.estadoCaducidad = estadoCaducidad == null ? null : estadoCaducidad.getId();
    }

    public EDisponibilidad getDisponibilidad() {
        return disponibilidad == null ? null : EDisponibilidad.fromId(disponibilidad);
    }

    public void setDisponibilidad(EDisponibilidad disponibilidad) {
        this.disponibilidad = disponibilidad == null ? null : disponibilidad.getId();
    }

    public Lotes getLote() {
        return lote;
    }

    public void setLote(Lotes lote) {
        this.lote = lote;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}