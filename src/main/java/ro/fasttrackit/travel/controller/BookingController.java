package ro.fasttrackit.travel.controller;

import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.travel.domain.Booking;
import ro.fasttrackit.travel.service.BookingService;

import java.util.List;

@RestController
public class BookingController {
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/api/bookings")
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @PostMapping("/api/vacations/{id}/bookings")
    public Booking addBooking(@PathVariable Integer id, @RequestBody Booking newBooking) {
        if (!newBooking.getTouristName().isEmpty()) {
            return bookingService.addBooking(id, newBooking);
        } else {
            return null;
        }
    }

    @DeleteMapping("/api/bookings/{bookingId}")
    public Booking deleteBooking(@PathVariable int bookingId) {
        return bookingService.deleteBooking(bookingId);
    }

    @GetMapping("/api/bookings/{bookingId}")
    public Booking getBookingById(@PathVariable int bookingId) {
        return bookingService.getBookingById(bookingId);
    }
}
