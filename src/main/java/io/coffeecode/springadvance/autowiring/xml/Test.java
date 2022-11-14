package io.coffeecode.springadvance.autowiring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("configs/autowiring/xml/config.xml");
        Employee employee = ctx.getBean("employee", Employee.class);
        System.out.println(employee);
    }
}
