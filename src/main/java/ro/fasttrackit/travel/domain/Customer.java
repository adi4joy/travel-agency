package ro.fasttrackit.travel.domain;

import javax.persistence.Entity;

@Entity
public class Customer {
    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
