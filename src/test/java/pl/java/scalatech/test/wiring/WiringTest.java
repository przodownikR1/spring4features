package pl.java.scalatech.test.wiring;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;
import pl.java.scalatech.wiring.Car;
import pl.java.scalatech.wiring.Repair;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { WiringTest.MyConfig.class })
@Slf4j
public class WiringTest {

    
    @Autowired
    Map<String,Repair> strategy;
    
    Car item = new Car();
    
    @Test
    public void shouldWiringBeanIntoMap(){
        assertThat(strategy).isNotNull().hasSize(3);
        strategy.entrySet().stream().forEach(entry -> log.info("key : {} , value : {}",entry.getKey(),entry.getValue()));
        strategy.entrySet().stream().forEach(entry -> entry.getValue().print(log,item));
    }
    
    
    @Configuration
    @ComponentScan(basePackages="pl.java.scalatech.wiring")
    static class MyConfig{
        
    }
}
