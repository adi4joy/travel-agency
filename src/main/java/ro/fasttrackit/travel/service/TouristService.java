package ro.fasttrackit.travel.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.travel.domain.Tourist;
import ro.fasttrackit.travel.exception.ResourceNotFoundException;
import ro.fasttrackit.travel.persistence.TouristRepository;

import java.util.List;

@Service
public class TouristService {
    private final TouristRepository touristRepository;

    public TouristService(TouristRepository touristRepository) {
        this.touristRepository = touristRepository;
    }

    public List<Tourist> getAllTourists() {
        return touristRepository.findAll();
    }

    public Tourist getTouristById(Integer touristId) {
        return getOrThrow(touristId);
    }

    public Tourist addTourist(Tourist tourist) {
        return touristRepository.save(tourist);
    }

    public Tourist deleteTourist(int touristId) {
        Tourist touristToDelete = getOrThrow(touristId);
        touristRepository.deleteById(touristId);
        return touristToDelete;
    }

    private Tourist getOrThrow(int touristId) {
        return touristRepository.findById(touristId)
                .orElseThrow(() -> new ResourceNotFoundException("Could not find tourist with id " + touristId));
    }
}
