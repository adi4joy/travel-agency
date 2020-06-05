package ro.fasttrackit.travel.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import ro.fasttrackit.travel.domain.Vacation;
import ro.fasttrackit.travel.domain.VacationCategory;
import ro.fasttrackit.travel.service.ImageUrlService;
import ro.fasttrackit.travel.service.VacationService;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

@Controller
public class VacationUIController {
    private final VacationService vacationService;
    private final ImageUrlService imageUrlService;

    public VacationUIController(VacationService vacationService, ImageUrlService imageUrlService) {
        this.vacationService = vacationService;
        this.imageUrlService = imageUrlService;
    }

    //Welcome Page
    @GetMapping("welcome")
    public String welcomePage(Model pageModel) {
        return "welcome";
    }

    //My Bookings Page
    @GetMapping("bookings")
    public String bookingsPage(Model pageModel) {
        return "bookings";
    }

    //get all vacations
    @GetMapping("vacations")
    public String vacationsPage(@RequestParam(name = "category", required = false) VacationCategory vacationCategory, Model pageModel) {
        if (vacationCategory != null) {
            pageModel.addAttribute("vacations", vacationService.getVacationsForCategory(vacationCategory));
        } else {
            pageModel.addAttribute("vacations", vacationService.getAll());
        }
        pageModel.addAttribute("categories", Stream.of(VacationCategory.values())
                .map(v -> v.name().toLowerCase())
                .collect(toList()));
        return "vacations";
    }


    //Details Page
    //get vacation by id
    @GetMapping("vacations/{vacationId}")
    public String vacationsPageWithDetails(@PathVariable Integer vacationId, Model pageModel) {
        pageModel.addAttribute("showDetails", true);
        Vacation vacationById = vacationService.getVacationById(vacationId);
        pageModel.addAttribute("selectedVacation", vacationById);
        return "details";
    }

}
