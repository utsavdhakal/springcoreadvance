package io.coffeecode.springadvance.stereotype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("configs/stereotype/config.xml");
        Instructor instructor = ctx.getBean("inst", Instructor.class);
        System.out.println(instructor.hashCode());

        Instructor instructor2 = ctx.getBean("inst", Instructor.class);
        System.out.println(instructor2.hashCode());
    }
}
