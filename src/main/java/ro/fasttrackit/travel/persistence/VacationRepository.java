package ro.fasttrackit.travel.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.travel.domain.Vacation;

public interface VacationRepository extends JpaRepository<Vacation, Integer> {
}
