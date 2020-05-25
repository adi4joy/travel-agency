package ro.fasttrackit.travel.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class ImageUrl {
    @Id
    @GeneratedValue
    private Integer imageUrlId;
    private String url;

    public ImageUrl() {
    }

    public ImageUrl(String url) {
        this.url = url;
    }

    public Integer getImageUrlId() {
        return imageUrlId;
    }

    public void setImageUrlId(Integer imageUrlId) {
        this.imageUrlId = imageUrlId;
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
        return Objects.equals(imageUrlId, imageUrl.imageUrlId) &&
                Objects.equals(url, imageUrl.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageUrlId, url);
    }

    @Override
    public String toString() {
        return "ImageUrl{" +
                "id=" + imageUrlId +
                ", url='" + url + '\'' +
                '}';
    }
}
