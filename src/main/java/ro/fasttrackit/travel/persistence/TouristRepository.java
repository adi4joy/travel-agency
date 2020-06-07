package ro.fasttrackit.travel.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.travel.domain.Tourist;

public interface TouristRepository extends JpaRepository<Tourist, Integer> {
}
