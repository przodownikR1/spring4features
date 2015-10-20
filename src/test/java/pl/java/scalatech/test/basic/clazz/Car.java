package pl.java.scalatech.test.basic.clazz;

public class Car {  //Car class controls the creation of the engine

    private Engine engine;
    
    public Car(){
        engine = new Engine(); //tight coupling 
    }
    
}
