package ro.fasttrackit.travel.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.travel.domain.Vacation;
import ro.fasttrackit.travel.domain.VacationCategory;

import java.util.List;

public interface VacationRepository extends JpaRepository<Vacation, Integer> {
    List<Vacation> findByCategory(VacationCategory category);
}
