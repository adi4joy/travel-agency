package ro.fasttrackit.travel.controller;

import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.travel.domain.Vacation;
import ro.fasttrackit.travel.service.VacationService;

@RestController
@RequestMapping("vacations")
public class VacationController {
    private final VacationService vacationService;

    public VacationController(VacationService vacationService) {
        this.vacationService = vacationService;
    }

    //add a vacation
    @PostMapping
    public Vacation addVacation(@RequestBody Vacation vacation) {
        return vacationService.addVacation(vacation);
    }

    //delete a vacation
    @DeleteMapping("{vacationId}")
    public Vacation deleteVacation(@PathVariable int vacationId) {
        return vacationService.deleteVacation(vacationId);
    }

    //update a vacation
    @PutMapping("{vacationId}")
    public Vacation updateVacation(@PathVariable int vacationId, @RequestBody Vacation vacation) {
        return vacationService.updateVacation(vacationId, vacation);
    }
}
