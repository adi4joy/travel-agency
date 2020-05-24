package ro.fasttrackit.travel.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.util.Collections.emptyList;

@Entity
public class Vacation {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private int stars;
    private String location;
    private double rating;
    private int price;
    private int duration;
    @OneToMany(cascade = CascadeType.ALL)
    private List<ImageUrl> imageUrl;

    public Vacation() {
    }

    public Vacation(String name, int stars, String location, double rating, int price, int duration) {
        this(name, stars, location, rating, price, duration, List.of());
    }

    public Vacation(String name, int stars, String location, double rating, int price, int duration, List<ImageUrl> imagesUrl) {
        this.name = name;
        this.stars = stars;
        this.location = location;
        this.rating = rating;
        this.price = price;
        this.duration = duration;
        this.imageUrl = new ArrayList<>(imagesUrl == null ? emptyList() : imagesUrl);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vacation vacation = (Vacation) o;
        return stars == vacation.stars &&
                rating == vacation.rating &&
                price == vacation.price &&
                duration == vacation.duration &&
                Objects.equals(id, vacation.id) &&
                Objects.equals(name, vacation.name) &&
                Objects.equals(location, vacation.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, stars, location, rating, price, duration);
    }

    @Override
    public String toString() {
        return "Vacation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stars=" + stars +
                ", location='" + location + '\'' +
                ", rating=" + rating +
                ", price=" + price +
                ", duration=" + duration +
                '}';
    }

    public List<ImageUrl> getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(List<ImageUrl> imageUrl) {
        this.imageUrl = imageUrl;
    }
}
