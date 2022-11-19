package io.coffeecode.springadvance.injectinginterfaces;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDAOImpl2 implements OrderDAO {
    @Override
    public void createOrder() {
        System.out.println("Inside OrderDAOImpl2 createOrder().");
    }
}
