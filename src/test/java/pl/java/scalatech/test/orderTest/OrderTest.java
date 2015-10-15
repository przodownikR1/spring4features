package pl.java.scalatech.test.orderTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;
import pl.java.scalatech.order.Company;
import pl.java.scalatech.order.OrderConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { OrderConfiguration.class })
@Slf4j
public class OrderTest {

    @Autowired
    private Company company;
    
    @Test
    public void shouldOrderBeanInCollectio() {
        log.info("+++  {}",company.getPeople());
        
    }
    
    
}
