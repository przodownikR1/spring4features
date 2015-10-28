package pl.java.scalatech.test.config.domain;

import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class ElectricEngine implements Engine {

    @Override
    public String getName() {
        return "electric";
    }

    @Override
    public String getType() {
        return "1kw";
    }

}
