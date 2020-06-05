package ro.fasttrackit.travel.controller;

import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.travel.domain.Vacation;
import ro.fasttrackit.travel.service.VacationService;

import java.util.List;

@RestController
@RequestMapping("/api/vacations")
public class VacationController {
    private final VacationService vacationService;

    public VacationController(VacationService vacationService) {
        this.vacationService = vacationService;
    }

    @GetMapping
    public List<Vacation> getAllVacations() {
        return vacationService.getAll();
    }

    @PostMapping
    public Vacation addVacation(@RequestBody Vacation newVacation) {
        return vacationService.addVacation(newVacation);
    }

    @DeleteMapping("{vacationId}")
    public Vacation deleteVacation(@PathVariable int vacationId) {
        return vacationService.deleteVacation(vacationId);
    }

    @PutMapping("{vacationId}")
    public Vacation updateVacation(@PathVariable int vacationId, @RequestBody Vacation vacation) {
        return vacationService.updateVacation(vacationId, vacation);
    }

    @GetMapping("{vacationId}")
    public Vacation getVacationById(@PathVariable int vacationId) {
        return vacationService.getVacationById(vacationId);
    }
}
