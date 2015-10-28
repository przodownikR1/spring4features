package pl.java.scalatech.test.config.domain;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@Primary
@ToString
public class HydrogenEngine implements Engine{

    @Override
    public String getName() {
        return "hydrogen";
    }

    @Override
    public String getType() {
        return "100cm3";
    }

}
