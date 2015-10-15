package pl.java.scalatech.order;

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Configuration
@ComponentScan(basePackages = "pl.java.scalatech.order")
@Slf4j
public class OrderConfiguration {

    @Bean
    Customer customer() {
        return new Customer();
    }

    @Bean
    Customer customer2() {
        return new Customer();
    }

    @Bean
    Employee employee() {
        return new Employee();
    }
    
    @Bean 
    Company company(List<Person> people){
        return new Company(people);
    }



}
