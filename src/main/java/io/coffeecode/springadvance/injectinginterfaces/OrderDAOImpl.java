package io.coffeecode.springadvance.injectinginterfaces;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("dao")
@Primary
public class OrderDAOImpl implements OrderDAO {

    @Override
    public void createOrder() {
        System.out.println("Inside OrderDAO createOrder().");
    }
}
