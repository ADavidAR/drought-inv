package com.company.droughtinv.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum EstadoCaduc implements EnumClass<String> {

    BUEN_ESTADO("BUEN_ESTADO"),
    POR_CADUCAR("POR_CADUCAR"),
    CADUCO("CADUCO");

    private final String id;

    EstadoCaduc(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static EstadoCaduc fromId(String id) {
        for (EstadoCaduc at : EstadoCaduc.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}