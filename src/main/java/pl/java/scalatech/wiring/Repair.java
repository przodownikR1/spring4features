package pl.java.scalatech.wiring;

import org.slf4j.Logger;

@FunctionalInterface
public interface Repair {

    boolean done(Item item);
    
    default void print(Logger log,Item item){
        log.info("class : {} , {}",item.getClass().getName(),item);
    }
  
}
