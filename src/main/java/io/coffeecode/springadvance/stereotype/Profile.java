package io.coffeecode.springadvance.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {
    @Value("Senior Java Developer")
    private String title;

    @Value("Global Software Solution")
    private String company;

    @Override
    public String toString() {
        return "Profile{" +
                "title='" + title + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
