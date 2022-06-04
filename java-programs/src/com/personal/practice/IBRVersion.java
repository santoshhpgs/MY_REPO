package com.personal.practice;

public enum IBRVersion {
    
    COP("Clearing on Process"),
    OVC("Order Validation and Correction");

    
    private final String name;

    public String getName() {
        return name;
    }
    
    IBRVersion(final String name) {
        this.name = name;
    }
}
