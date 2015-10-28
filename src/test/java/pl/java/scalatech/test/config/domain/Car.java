package pl.java.scalatech.test.config.domain;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Car {

    private Engine engine;
    
    public Car(Engine engine){
        this.engine = engine;
    }
    
    public void introduceYourself(){
      log.info("++ car with : {}",engine);  
    }
    
}
