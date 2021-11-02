package com.smoothstack.utopia.booking.controller;

import com.smoothstack.utopia.booking.entity.Flight;
import com.smoothstack.utopia.booking.entity.Passenger;
import com.smoothstack.utopia.booking.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping(path = "/all")
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }

    @GetMapping(path = "/{id}/all")
    public List<Passenger> getPassengersByFlightId(@PathVariable int id) {
        return flightService.getPassengersByFlightId(id);
    }
}
