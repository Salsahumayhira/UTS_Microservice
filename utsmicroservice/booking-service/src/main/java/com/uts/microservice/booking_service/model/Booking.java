package com.uts.microservice.booking_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerId;
    private Long movieId;
    private LocalDateTime bookingDate;
    private int seatNumber;

    public Booking() {}

    public Booking(Long customerId, Long movieId, LocalDateTime bookingDate, int seatNumber) {
        this.customerId = customerId;
        this.movieId = movieId;
        this.bookingDate = bookingDate;
        this.seatNumber = seatNumber;
    }

    // Getter dan Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public LocalDateTime getbookingDate() {
        return bookingDate;
    }

    public void setbookingDate(LocalDateTime bookingDate) {
        this.bookingDate = bookingDate;
    }

    public int getseatNumber() {
        return seatNumber;
    }

    public void setseatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}
