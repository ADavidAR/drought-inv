package com.company.droughtinv.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@JmixEntity
@Table(name = "MOVIMIENTOS")
@Entity
public class Movimientos {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "FACTOR")
    private Integer factor;

    public Integer getFactor() {
        return factor;
    }

    public void setFactor(Integer factor) {
        this.factor = factor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}