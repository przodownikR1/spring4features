package pl.java.scalatech.wiring;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class CarRepair implements Repair{

    @Override
    public boolean done(Item item) {
       
        return false;
    }

}
