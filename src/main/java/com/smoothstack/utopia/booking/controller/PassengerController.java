package com.smoothstack.utopia.booking.controller;

import com.smoothstack.utopia.booking.entity.Passenger;
import com.smoothstack.utopia.booking.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/bookings/passenger")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @GetMapping(path = "/{id}")
    @PreAuthorize("hasAuthority('Administrator')")
    public ResponseEntity<Passenger> getPassengerById(@PathVariable int id) {
        Optional<Passenger> p = passengerService.getPassengerById(id);
        return p.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null));
    }

    @PostMapping(path = "/add")
    @PreAuthorize("hasAuthority('Administrator')")
    public ResponseEntity<Passenger> addPassenger(@RequestBody Passenger passenger) {
        return ResponseEntity.status(201).body(passengerService.addPassenger(passenger));
    }

    @PutMapping(path = "/{id}/update")
    @PreAuthorize("hasAuthority('Administrator')")
    public ResponseEntity<Passenger> updatePassenger(@PathVariable int id, @RequestBody Passenger passenger) {
        Passenger passenger1 = passengerService.updatePassenger(id, passenger);
        return ResponseEntity.ok(passenger1);
    }

    @DeleteMapping(path = "/{id}/delete")
    @PreAuthorize("hasAuthority('Administrator')")
    public ResponseEntity<Passenger> deletePassenger(@PathVariable int id) {
        passengerService.deletePassenger(id);
        return ResponseEntity.ok(null);
    }
}
