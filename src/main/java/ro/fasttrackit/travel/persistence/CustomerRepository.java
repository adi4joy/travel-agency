package ro.fasttrackit.travel.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.travel.domain.Tourist;

public interface CustomerRepository extends JpaRepository<Tourist, Integer> {
}
