package io.coffeecode.springadvance.autowiring.assignment.restaurant;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("configs/autowiring/assignment/config.xml");
        Customer customer = ctx.getBean("customer", Customer.class);
        System.out.println(customer);
    }
}
