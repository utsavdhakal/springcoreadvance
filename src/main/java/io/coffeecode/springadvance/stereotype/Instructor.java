package io.coffeecode.springadvance.stereotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("inst")
@Scope("prototype")
public class Instructor {
    @Value("#{T(java.lang.Math).abs(-140)}")
    private int id = 100;
    @Value("James Gosling")
    private String name = "Bharat Thipperedy";

    @Value("#{subjects}")
    private List<String> subjects;

    @Autowired
    private Profile profile;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subjects=" + subjects +
                ", profile=" + profile +
                '}';
    }
}
