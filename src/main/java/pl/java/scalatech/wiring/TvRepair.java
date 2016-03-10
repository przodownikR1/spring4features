package pl.java.scalatech.wiring;

import org.springframework.stereotype.Component;

@Component
public class TvRepair implements Repair {

    @Override
    public boolean done(Item item) {
        // TODO Auto-generated method stub
        return false;
    }

}
