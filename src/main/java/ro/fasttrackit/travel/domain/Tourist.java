package ro.fasttrackit.travel.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Tourist {
    @Id
    @GeneratedValue
    private Integer touristId;
    private String touristName;

    public Tourist() {
    }

    public Tourist(String touristName) {
        this.touristName = touristName;
    }

    public Integer getTouristId() {
        return touristId;
    }

    public void setTouristId(Integer touristId) {
        this.touristId = touristId;
    }

    public String getTouristName() {
        return touristName;
    }

    public void setTouristName(String touristName) {
        this.touristName = touristName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tourist tourist = (Tourist) o;
        return Objects.equals(touristId, tourist.touristId) &&
                Objects.equals(touristName, tourist.touristName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(touristId, touristName);
    }

    @Override
    public String toString() {
        return "Tourist{" +
                "touristId=" + touristId +
                ", name='" + touristName + '\'' +
                '}';
    }
}
