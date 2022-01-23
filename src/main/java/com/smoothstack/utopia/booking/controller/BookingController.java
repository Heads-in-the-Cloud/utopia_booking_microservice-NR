package com.smoothstack.utopia.booking.controller;

import com.smoothstack.utopia.booking.entity.Booking;
import com.smoothstack.utopia.booking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping(path = "/all")
    @PreAuthorize("hasAuthority('Administrator')")
    public ResponseEntity<List<Booking>> getAllBookings() {
        return ResponseEntity.ok(bookingService.getAllBookings());
    }

    @PostMapping(path = "/add")
    @PreAuthorize("hasAuthority('Administrator')")
    public ResponseEntity<Booking> addBooking() {
        return ResponseEntity.status(201).body(bookingService.addBooking());
    }

    @DeleteMapping(path = "/{id}/delete")
    @PreAuthorize("hasAuthority('Administrator')")
    public ResponseEntity<Booking> deleteBooking(@PathVariable("id") Integer id) {
        bookingService.deleteBooking(id);
        return ResponseEntity.ok(null);
    }

    @PutMapping(path = "/{id}/update")
    @PreAuthorize("hasAuthority('Administrator')")
    public ResponseEntity<Booking> updateBooking(@PathVariable("id") Integer id, @RequestBody Booking booking) {
        return ResponseEntity.ok(bookingService.updateBooking(id, booking));
    }

    @GetMapping(path = "/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("OK");
    }
}
