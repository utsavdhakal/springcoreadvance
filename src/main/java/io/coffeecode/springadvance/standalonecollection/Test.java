package io.coffeecode.springadvance.standalonecollection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("configs/standalonecollection/config.xml");
        Products products = ctx.getBean("products", Products.class);
        System.out.println(products.getProducts().getClass());
        System.out.println(products.getProducts());
    }
}
