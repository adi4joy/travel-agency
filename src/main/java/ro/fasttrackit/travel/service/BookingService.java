package ro.fasttrackit.travel.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.travel.domain.Booking;
import ro.fasttrackit.travel.exception.ResourceNotFoundException;
import ro.fasttrackit.travel.persistence.BookingRepository;

import java.util.List;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Booking getBookingById(Integer bookingId) {
        return getOrThrow(bookingId);
    }

    public Booking addBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public Booking deleteBooking(int bookingId) {
        Booking bookingToDelete = getOrThrow(bookingId);
        bookingRepository.deleteById(bookingId);
        return bookingToDelete;
    }

    private Booking getOrThrow(int bookingId) {
        return bookingRepository.findById(bookingId)
                .orElseThrow(() -> new ResourceNotFoundException("Could not find booking with id " + bookingId));
    }
}
