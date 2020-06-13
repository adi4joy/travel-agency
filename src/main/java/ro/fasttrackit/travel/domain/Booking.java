package ro.fasttrackit.travel.domain;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Booking {
    @Id
    @GeneratedValue
    private Integer bookingId;
    @Column(nullable = false)
    private String touristName;
    @DateTimeFormat(pattern = "dd-MMM-yyyy")
    private LocalDate startDate;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Vacation vacation;

    public Booking() {
    }


    public Booking(String touristName, LocalDate startDate, Vacation vacation) {
        this.touristName = touristName;
        this.startDate = startDate;
        this.vacation = vacation;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public String getTouristName() {
        return touristName;
    }

    public void setTouristName(String touristName) {
        this.touristName = touristName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Vacation getVacation() {
        return vacation;
    }

    public void setVacation(Vacation vacation) {
        this.vacation = vacation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(bookingId, booking.bookingId) &&
                Objects.equals(touristName, booking.touristName) &&
                Objects.equals(startDate, booking.startDate) &&
                Objects.equals(vacation, booking.vacation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, touristName, startDate, vacation);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", touristName='" + touristName + '\'' +
                ", startDate=" + startDate +
                ", vacation=" + vacation +
                '}';
    }
}
