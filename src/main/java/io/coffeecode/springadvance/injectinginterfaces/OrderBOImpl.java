package io.coffeecode.springadvance.injectinginterfaces;

public class OrderBOImpl implements OrderBO {
    private OrderDAO dao;

    @Override
    public void placeOrder() {
        System.out.println("Inside OrderBO placeOrder().");
        dao.createOrder();
    }

    public OrderDAO getDao() {
        return dao;
    }

    public void setDao(OrderDAO dao) {
        this.dao = dao;
    }
}
