package io.coffeecode.springadvance.stereotype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("configs/stereotype/config.xml");
        Instructor instructor = ctx.getBean("inst", Instructor.class);
        System.out.println(instructor);
    }
}
