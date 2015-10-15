package pl.java.scalatech.order;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component 
@Order(value=2)
public class Customer implements Person { 
}

