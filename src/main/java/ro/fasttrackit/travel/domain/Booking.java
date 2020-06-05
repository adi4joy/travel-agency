package ro.fasttrackit.travel.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Booking {
    @Id
    @GeneratedValue
    private Integer bookingId;
    @Enumerated(EnumType.STRING)
    private VacationCategory category;
    private String name;
    private int stars;
    private String location;
    private double rating;
    private int price;
    private int duration;
    @Column(length = 1000)
    private String description;
    @ManyToOne(cascade = CascadeType.ALL)
    private List<Customer> customers;
}
