package com.smoothstack.utopia.booking.controller;

import com.smoothstack.utopia.booking.entity.BookingAgent;
import com.smoothstack.utopia.booking.service.BookingAgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/bookings/bookingagent")
public class BookingAgentController {

    @Autowired
    private BookingAgentService bookingAgentService;

    @GetMapping(path = "/all")
    public ResponseEntity<List<BookingAgent>> getAllBookingAgent() {
        return ResponseEntity.ok(bookingAgentService.getAllBookingAgent());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<BookingAgent> getBookingAgentById(@PathVariable int id) {
        Optional<BookingAgent> bookingAgent = bookingAgentService.getBookingAgentById(id);
        return bookingAgent.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.badRequest().build());
    }

    @PostMapping(path = "/add")
    public ResponseEntity<BookingAgent> addBookingAgent(@RequestBody BookingAgent bookingAgent) {
        return ResponseEntity.status(201).body(bookingAgentService.addBookingAgent(bookingAgent));
    }
}

