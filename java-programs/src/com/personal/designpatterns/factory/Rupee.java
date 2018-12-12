package com.personal.designpatterns.factory;

public class Rupee implements Currency {
    @Override
    public String getSymbol() {
           return "Rs";
    }
}
