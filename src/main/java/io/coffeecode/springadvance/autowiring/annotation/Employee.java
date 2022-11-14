package io.coffeecode.springadvance.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private Address address;

    public Employee() {
    }

    @Autowired
    public Employee(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
