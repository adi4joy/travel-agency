package ro.fasttrackit.travel.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class ImageUrl {
    @Id
    @GeneratedValue
    private Integer id;
    private String url;

    public ImageUrl() {
    }

    public ImageUrl(String url) {
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImageUrl imageUrl = (ImageUrl) o;
        return Objects.equals(id, imageUrl.id) &&
                Objects.equals(url, imageUrl.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, url);
    }

    @Override
    public String toString() {
        return "ImageUrl{" +
                "id=" + id +
                ", url='" + url + '\'' +
                '}';
    }
}
