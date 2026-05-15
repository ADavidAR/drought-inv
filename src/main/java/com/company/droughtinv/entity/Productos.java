package com.company.droughtinv.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.NumberFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
import java.util.UUID;

@JmixEntity
@Table(name = "PRODUCTOS", indexes = {
        @Index(name = "IDX_PRODUCTOS_CATEGORIA", columnList = "CATEGORIA_ID"),
        @Index(name = "IDX_PRODUCTOS_PROVEEDOR", columnList = "PROVEEDOR_ID")
})
@Entity
public class Productos {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @NotNull(message = "Ingrese un nombre")
    @Column(name = "NOMBRE", nullable = false)
    private String nombre;

    @NotNull
    @Column(name = "DESCRIPCION", nullable = false)
    @Lob
    private String descripcion;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CADUCACION", nullable = false)
    @NotNull
    private Date fechaCaducacion;

    @NotNull
    @NumberFormat(pattern = "#.##")
    @Column(name = "PRECIO", nullable = false)
    private Double precio;

    @NumberFormat(pattern = "#.##")
    @Column(name = "COSTO", nullable = false)
    @NotNull
    private Double costo;

    @JoinColumn(name = "CATEGORIA_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Categorias categoria;

    @JoinColumn(name = "PROVEEDOR_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Proveedor proveedor;

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Date getFechaCaducacion() {
        return fechaCaducacion;
    }

    public void setFechaCaducacion(Date fechaCaducacion) {
        this.fechaCaducacion = fechaCaducacion;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}