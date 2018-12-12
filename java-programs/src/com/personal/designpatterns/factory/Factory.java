package com.personal.designpatterns.factory;

public class Factory {
    public static void main(String args[]) {
         //  String country = args[0];
           Currency rupee = CurrencyFactory.createCurrency("India");/*India,Singapore,US*/
           System.out.println(rupee.getSymbol());
    }
}
