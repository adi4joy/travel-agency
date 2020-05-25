package ro.fasttrackit.travel.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.travel.domain.ImageUrl;

public interface ImageUrlRepository extends JpaRepository<ImageUrl, Integer> {
}
