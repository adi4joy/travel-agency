package ro.fasttrackit.travel.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ro.fasttrackit.travel.service.ImageUrlService;
import ro.fasttrackit.travel.service.VacationService;

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
    public String vacationsPage(Model pageModel) {
        pageModel.addAttribute("vacations", vacationService.getAll());
        return "vacations";
    }

    //get vacation by id
    @GetMapping("vacations/{vacationId}")
    public String vacationsPageWithDetails(@PathVariable Integer vacationId, Model pageModel) {
        pageModel.addAttribute("showDetails", true);
        pageModel.addAttribute("selectedVacation", vacationService.getVacationById(vacationId));
//        pageModel.addAttribute("selectedImageUrl", imageUrlService.getImageUrlById(imageUrlId));
        return vacationsPage(pageModel);
    }

}
