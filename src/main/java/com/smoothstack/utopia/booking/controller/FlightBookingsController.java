package com.smoothstack.utopia.booking.controller;

import com.smoothstack.utopia.booking.entity.FlightBookings;
import com.smoothstack.utopia.booking.service.FlightBookingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings/flightbookings")
public class FlightBookingsController {

    @Autowired
    private FlightBookingsService flightBookingService;

    @GetMapping("/all")
    public ResponseEntity<List<FlightBookings>> getAllFlightBookings() {
        return ResponseEntity.ok(flightBookingService.getAllFlightBookings());
    }

    @GetMapping("/f/{id}")
    public ResponseEntity<FlightBookings> getFlightBookingByFlightId(@PathVariable int id) {
        return ResponseEntity.ok(flightBookingService.getFlightBookingByFlightId(id));
    }

    @GetMapping("/b/{id}")
    public ResponseEntity<FlightBookings> getFlightBookingByBookingId(@PathVariable int id) {
        return ResponseEntity.ok(flightBookingService.getFlightBookingByBookingId(id));
    }

    @PostMapping("/add")
    public ResponseEntity<FlightBookings> addFlightBooking(@RequestBody FlightBookings flightBookings) {
        return ResponseEntity.status(201).body(flightBookingService.addFlightBooking(flightBookings));
    }
}
