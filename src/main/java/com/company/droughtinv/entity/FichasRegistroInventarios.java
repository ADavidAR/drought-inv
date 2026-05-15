package com.company.droughtinv.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigInteger;
import java.util.Date;
import java.util.UUID;

@JmixEntity
@Table(name = "FICHAS_REGISTRO_INVENTARIOS", indexes = {
        @Index(name = "IDX_FICHAS_REGISTRO_INVENTARIOS_LOTE", columnList = "LOTE_ID"),
        @Index(name = "IDX_FICHAS_REGISTRO_INVENTARIOS_SUCURSAL", columnList = "SUCURSAL_ID"),
        @Index(name = "IDX_FICHAS_REGISTRO_INVENTARIOS_CLIENTE", columnList = "CLIENTE_ID")
})
@Entity
public class FichasRegistroInventarios {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_MOVIMIENTO", nullable = false)
    @NotNull
    private Date fechaMovimiento;

    @Column(name = "CANTIDAD_STOCK", nullable = false, precision = 19)
    @NotNull
    private BigInteger cantidadStock;

    @JoinColumn(name = "LOTE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Lotes lote;

    @JoinColumn(name = "SUCURSAL_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Sucursal sucursal;

    @JoinColumn(name = "CLIENTE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Lotes getLote() {
        return lote;
    }

    public void setLote(Lotes lote) {
        this.lote = lote;
    }

    public BigInteger getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(BigInteger cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Date getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(Date fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}