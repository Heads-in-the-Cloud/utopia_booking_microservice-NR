package com.smoothstack.utopia.booking.controller;

import com.smoothstack.utopia.booking.entity.Passenger;
import com.smoothstack.utopia.booking.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/passengers")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<Passenger> getPassengerById(@PathVariable int id) {
        Optional<Passenger> p = passengerService.getPassengerById(id);
        return p.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null));
    }

    @PostMapping(path = "/add")
    public ResponseEntity<Passenger> addPassenger(@RequestBody Passenger passenger) {
        Passenger passenger1 = passengerService.addPassenger(passenger);
        return ResponseEntity.ok(passenger1);
    }

    @PutMapping(path = "/{id}/update")
    public ResponseEntity<Passenger> updatePassenger(@PathVariable int id, @RequestBody Passenger passenger) {
        Passenger passenger1 = passengerService.updatePassenger(id, passenger);
        return ResponseEntity.ok(passenger1);
    }

    @DeleteMapping(path = "/{id}/delete")
    public ResponseEntity<Passenger> deletePassenger(@PathVariable int id) {
        passengerService.deletePassenger(id);
        return ResponseEntity.ok(null);
    }
}
