package com.company.droughtinv.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
import java.util.UUID;

@JmixEntity
@Table(name = "LOTES")
@Entity
public class Lotes {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_ELABORACION", nullable = false)
    @NotNull
    private Date fechaElaboracion;

    @NotNull
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CADUCIDAD", nullable = false)
    private Date fechaCaducidad;

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public Date getFechaElaboracion() {
        return fechaElaboracion;
    }

    public void setFechaElaboracion(Date fechaElaboracion) {
        this.fechaElaboracion = fechaElaboracion;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}