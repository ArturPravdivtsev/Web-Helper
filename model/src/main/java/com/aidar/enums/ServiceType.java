package com.aidar.enums;

public enum ServiceType {

    MARKET("Buy smth in the market"),
    STREET("Some help on the street"),
    HOME("Some help in the home");

    private String representation;

    ServiceType(String representation) {
        this.representation = representation;
    }

    public String getRepresentation() {
        return representation;
    }

}
