package ro.fasttrackit.travel.controller;

import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.travel.domain.Booking;
import ro.fasttrackit.travel.service.BookingService;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @PostMapping
    public Booking addBooking(@RequestBody Booking newBooking) {
        return bookingService.addBooking(newBooking);
    }

    @DeleteMapping("{bookingId}")
    public Booking deleteBooking(@PathVariable int bookingId) {
        return bookingService.deleteBooking(bookingId);
    }

//    @PutMapping("{bookingId}")
//    public Booking updateBooking(@PathVariable int bookingId, @RequestBody Booking booking) {
//        return bookingService.updateBooking(bookingId, booking);
//    }

    @GetMapping("{bookingId}")
    public Booking getBookingById(@PathVariable int bookingId) {
        return bookingService.getBookingById(bookingId);
    }
}
