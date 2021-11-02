package com.smoothstack.utopia.booking.controller;

import com.smoothstack.utopia.booking.entity.Booking;
import com.smoothstack.utopia.booking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping(path = "/all")
    public ResponseEntity<List<Booking>> getAllBookings() {
        return ResponseEntity.ok(bookingService.getAllBookings());
    }

    @PostMapping(path = "/add")
    public ResponseEntity<Booking> addBooking() {
        return ResponseEntity.ok(bookingService.addBooking());
    }

    @DeleteMapping(path = "/{id}/delete")
    public ResponseEntity<Booking> deleteBooking(@PathVariable("id") Integer id) {
        bookingService.deleteBooking(id);
        return ResponseEntity.ok(null);
    }

    @PutMapping(path = "/{id}/update")
    public ResponseEntity<Booking> updateBooking(@PathVariable("id") Integer id, @RequestBody Booking booking) {
        return ResponseEntity.ok(bookingService.updateBooking(id, booking));
    }
}
