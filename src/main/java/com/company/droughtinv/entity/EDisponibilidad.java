package com.company.droughtinv.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum EDisponibilidad implements EnumClass<String> {

    EN_STOCK("EN_STOCK"),
    POR_AGOTAR("POR_AGOTAR"),
    AGOTADO("AGOTADO");

    private final String id;

    EDisponibilidad(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static EDisponibilidad fromId(String id) {
        for (EDisponibilidad at : EDisponibilidad.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}