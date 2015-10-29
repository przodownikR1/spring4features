package pl.java.scalatech.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import lombok.extern.slf4j.Slf4j;
import pl.java.scalatech.test.config.domain.Car;
import pl.java.scalatech.test.config.domain.ElectricEngine;
import pl.java.scalatech.test.config.domain.Engine;
import pl.java.scalatech.test.config.domain.HydrogenEngine;
import pl.java.scalatech.test.config.domain.SteamEngine;

@Configuration
@ComponentScan(basePackageClasses = { ElectricEngine.class, SteamEngine.class, HydrogenEngine.class, Car.class })
@Slf4j
public class EngineConfig {

    @Bean
    Car car(Engine engine) {
        return new Car(engine);
    }

    @Bean(name = "steamEngineC")
    @Profile("config")
    public Engine steam() {
        log.debug("+++ create steam engine ...");
        SteamEngine s=  new SteamEngine();
        s.setId("slawek");
        log.debug(s.getName());
        return s;
        
    }
}
