package io.coffeecode.springadvance.injectinginterfaces;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBOImpl implements OrderBO {
    private final OrderDAO dao;

    public OrderBOImpl(@Qualifier("dao2") OrderDAO dao) {
        this.dao = dao;
    }

    @Override
    public void placeOrder() {
        System.out.println("Inside OrderBO placeOrder().");
        dao.createOrder();
    }

}
