package ro.fasttrackit.travel.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.travel.domain.Vacation;
import ro.fasttrackit.travel.domain.VacationCategory;
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

    public Vacation getVacationById(Integer vacationId) {
        return getOrThrow(vacationId);
    }

    public Vacation addVacation(Vacation vacation) {
        return vacationRepository.save(vacation);
    }

    public Vacation deleteVacation(int vacationId) {
        Vacation vacationToDelete = getOrThrow(vacationId);
        vacationRepository.deleteById(vacationId);
        return vacationToDelete;
    }

    public Vacation updateVacation(int vacationId, Vacation vacation) {
        Vacation dbVacation = getOrThrow(vacationId);
        dbVacation.setName(vacation.getName());
        dbVacation.setStars(vacation.getStars());
        dbVacation.setLocation(vacation.getLocation());
        dbVacation.setRating(vacation.getRating());
        dbVacation.setPrice(vacation.getPrice());
        dbVacation.setDuration(vacation.getDuration());
        dbVacation.setDescription(vacation.getDescription());
        return vacationRepository.save(dbVacation);
    }

    private Vacation getOrThrow(int vacationId) {
        return vacationRepository.findById(vacationId)
                .orElseThrow(() -> new ResourceNotFoundException("Could not find vacation with id " + vacationId));
    }

    public List<Vacation> getVacationsForCategory(VacationCategory vacationCategory) {
        return vacationRepository.findByVacationCategory(vacationCategory);
    }
}
