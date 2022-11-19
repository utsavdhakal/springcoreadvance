package io.coffeecode.springadvance.injectinginterfaces;

public class OrderDAOImpl implements OrderDAO {

    @Override
    public void createOrder() {
        System.out.println("Inside OrderDAO createOrder().");
    }
}
