package com.smoothstack.utopia.booking.controller;

import com.smoothstack.utopia.booking.entity.BookingGuest;
import com.smoothstack.utopia.booking.service.BookingGuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/bookings/bookingguest")
public class BookingGuestController {

    @Autowired
    private BookingGuestService bookingGuestService;

    @GetMapping(path = "/all")
    public ResponseEntity<List<BookingGuest>> getAllBookingGuest() {
        return ResponseEntity.ok(bookingGuestService.getAllBookingGuest());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<BookingGuest> getBookingGuestById(@PathVariable int id) {
        Optional<BookingGuest> bookingGuest = bookingGuestService.getBookingGuestById(id);
        return bookingGuest.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.badRequest().build());
    }

    @PostMapping(path = "/add")
    public ResponseEntity<BookingGuest> addBookingGuest(@RequestBody BookingGuest bookingGuest) {
        return ResponseEntity.status(201).body(bookingGuestService.addBookingGuest(bookingGuest));
    }
}

