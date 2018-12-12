package com.personal.designpatterns;

public class BuilderPatternExample {
	  
    public static void main(String args[]) {
      
        //Creating object using Builder pattern in java
       // Cake whiteCake = new Cake.Builder().sugar(10).butter(0.5).eggs(2).vanila(2).flour(1.5). bakingpowder(0.75).milk(0.5).build();
      
        //Cake is ready to eat :)
       // System.out.println(whiteCake);
        Person prsn=new Person.PersonBuilder("chenni", "chennai", "hyderabad").lastName("achary").createPerson();
        System.out.println(prsn);
    }
}
