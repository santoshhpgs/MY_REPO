package com.personal.objectclassmethods;

public class GeekE 
{
	String name;
    int id;
      
    GeekE(String name, int id)
    {
        this.name = name;
        this.id = id;
     }
      
    @Override
    public boolean equals(Object obj)
    {
       // if both the object references are 
       // referring to the same object.
       if(this == obj)
            return true;
           
        // it checks if the argument is of the 
        // type Geek by comparing the classes 
        // of the passed argument and this object.
        // if(!(obj instanceof Geek)) return false; ---> avoid.
        if(obj == null || obj.getClass()!= this.getClass())
            return false;
           
        // type casting of the argument.    
        GeekE geek = (GeekE) obj;
           
        // comparing the state of argument with 
        // the state of 'this' Object.
        return (geek.name == this.name && geek.id == this.id);
    }
}
