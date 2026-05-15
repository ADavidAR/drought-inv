package com.company.droughtinv.entity;

import io.jmix.core.MetadataTools;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
import java.util.UUID;

@JmixEntity
@Table(name = "LOTES", indexes = {
        @Index(name = "IDX_LOTES_PRODUCTO", columnList = "PRODUCTO_ID"),
        @Index(name = "IDX_LOTES_PROVEEDOR", columnList = "PROVEEDOR_ID")
})
@Entity
public class Lotes {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "PRODUCTO_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Productos producto;

    @JoinColumn(name = "PROVEEDOR_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Proveedor proveedor;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_ELABORACION", nullable = false)
    @NotNull
    private Date fechaElaboracion;

    @NotNull
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CADUCIDAD", nullable = false)
    private Date fechaCaducidad;

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

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

    @InstanceName
    @DependsOnProperties({"id"})
    public String getInstanceName(MetadataTools metadataTools) {
        return metadataTools.format(id);
    }
}