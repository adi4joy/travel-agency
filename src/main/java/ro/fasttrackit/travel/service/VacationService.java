package ro.fasttrackit.travel.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.travel.domain.Vacation;
import ro.fasttrackit.travel.exception.ResourceNotFoundException;
import ro.fasttrackit.travel.persistence.VacationRepository;

import java.util.List;

@Service
public class VacationService {
    private final VacationRepository vacationRepository;

    public VacationService(VacationRepository vacationRepository) {
        this.vacationRepository = vacationRepository;
    }

    public List<Vacation> getAll() {
        return vacationRepository.findAll();
    }

    public Vacation getVacationById(Integer id) {
        return getOrThrow(id);
    }

    public Vacation addVacation(Vacation vacation) {
        return vacationRepository.save(vacation);
    }

    public Vacation deleteVacation(int id) {
        Vacation vacationToDelete = getOrThrow(id);
        vacationRepository.deleteById(id);
        return vacationToDelete;
    }

    public Vacation updateVacation(int id, Vacation vacation) {
        Vacation dbVacation = getOrThrow(id);
        dbVacation.setName(vacation.getName());
        dbVacation.setStars(vacation.getStars());
        dbVacation.setLocation(vacation.getLocation());
        dbVacation.setRating(vacation.getRating());
        dbVacation.setPrice(vacation.getPrice());
        dbVacation.setDuration(vacation.getDuration());
        return vacationRepository.save(dbVacation);
    }

    private Vacation getOrThrow(int id) {
        return vacationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Could not find vacation with id " + id));
    }
}
