package io.coffeecode.springadvance.injectinginterfaces;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("configs/injectinginterfaces/config.xml");
        OrderBO bo = ctx.getBean("bo", OrderBO.class);
        bo.placeOrder();
    }
}
