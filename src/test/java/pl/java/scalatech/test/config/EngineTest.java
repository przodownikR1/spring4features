package pl.java.scalatech.test.config;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;
import pl.java.scalatech.test.config.domain.Car;
import pl.java.scalatech.test.config.domain.Engine;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=EngineConfig.class)
@Slf4j
public class EngineTest {
   @Autowired
   List<Engine> engines;
  
    @Autowired
    private Car car;
      
    @Test
    public void shouldChooseHydrogenPrimaryFeature(){
         Assertions.assertThat(car).isNotNull();
         log.info("{}",car);
         car.introduceYourself();
    }
    @Test
    public void shouldInjectIntoList(){
        Assertions.assertThat(engines).hasSize(3);
    }
    
 
    
}
