package ro.fasttrackit.travel.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.travel.domain.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
}
