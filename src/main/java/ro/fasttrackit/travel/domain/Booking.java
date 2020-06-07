package ro.fasttrackit.travel.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Booking {
    @Id
    @GeneratedValue
    private Integer bookingId;
    private String name;
    private String location;
    private int price;
    private int duration;
    @ManyToOne(targetEntity = Tourist.class, cascade = CascadeType.ALL)
    Tourist tourist;

    public Booking() {
    }

    public Booking(String name, String location, int price, int duration, Tourist tourist) {
        this.name = name;
        this.location = location;
        this.price = price;
        this.duration = duration;
        this.tourist = tourist;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Tourist getTourist() {
        return tourist;
    }

    public void setTourist(Tourist tourist) {
        this.tourist = tourist;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return price == booking.price &&
                duration == booking.duration &&
                Objects.equals(bookingId, booking.bookingId) &&
                Objects.equals(name, booking.name) &&
                Objects.equals(location, booking.location) &&
                Objects.equals(tourist, booking.tourist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, name, location, price, duration, tourist);
    }


    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", price=" + price +
                ", duration=" + duration +
                ", tourist=" + tourist +
                '}';
    }
}
