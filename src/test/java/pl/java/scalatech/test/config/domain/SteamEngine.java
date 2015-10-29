package pl.java.scalatech.test.config.domain;

import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@ToString
public class SteamEngine implements Engine{
    @Setter
    private String id;
    @Override
    public String getName() {
        return "steam "+ " : "+ id ;
    }

    @Override
    public String getType() {
        return "1000m3";
    }
 
}
