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
    private Integer vacationId;
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
    @OneToMany(cascade = CascadeType.ALL)
    private List<ImageUrl> imageUrl;

    public Vacation() {
    }

    public Vacation(VacationCategory category, String name, int stars, String location, double rating, int price, int duration, String description) {
        this(category, name, stars, location, rating, price, duration, description, List.of());
    }

    public Vacation(VacationCategory category, String name, int stars, String location, double rating, int price, int duration, String description, List<ImageUrl> imagesUrl) {
        this.category = category;
        this.name = name;
        this.stars = stars;
        this.location = location;
        this.rating = rating;
        this.price = price;
        this.duration = duration;
        this.description = description;
        this.imageUrl = new ArrayList<>(imagesUrl == null ? emptyList() : imagesUrl);
    }

    public Integer getVacationId() {
        return vacationId;
    }

    public void setVacationId(Integer vacationId) {
        this.vacationId = vacationId;
    }

    public VacationCategory getCategory() {
        return category;
    }

    public void setCategory(VacationCategory category) {
        this.category = category;
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

    public void showStars(int stars) {
        this.stars = stars;
        if (stars > 0) {
            System.out.print("*" + " ");
            showStars(stars - 1);
        }
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ImageUrl> getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(List<ImageUrl> imageUrl) {
        this.imageUrl = imageUrl;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vacation vacation = (Vacation) o;
        return stars == vacation.stars &&
                Double.compare(vacation.rating, rating) == 0 &&
                price == vacation.price &&
                duration == vacation.duration &&
                Objects.equals(vacationId, vacation.vacationId) &&
                category == vacation.category &&
                Objects.equals(name, vacation.name) &&
                Objects.equals(location, vacation.location) &&
                Objects.equals(description, vacation.description) &&
                Objects.equals(imageUrl, vacation.imageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vacationId, category, name, stars, location, rating, price, duration, description, imageUrl);
    }

    @Override
    public String toString() {
        return "Vacation{" +
                "vacationId=" + vacationId +
                ", vacationCategory=" + category +
                ", name='" + name + '\'' +
                ", stars=" + stars +
                ", location='" + location + '\'' +
                ", rating=" + rating +
                ", price=" + price +
                ", duration=" + duration +
                ", description='" + description + '\'' +
                ", imageUrl=" + imageUrl +
                '}';
    }
}
