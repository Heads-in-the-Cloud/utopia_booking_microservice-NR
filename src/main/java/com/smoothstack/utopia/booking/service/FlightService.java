package com.smoothstack.utopia.booking.service;

import com.smoothstack.utopia.booking.entity.Flight;
import com.smoothstack.utopia.booking.entity.Passenger;
import com.smoothstack.utopia.booking.repository.FlightRepository;
import com.smoothstack.utopia.booking.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;
    @Autowired
    private PassengerRepository passengerRepository;

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public List<Passenger> getPassengersByFlightId(int id) {
        return passengerRepository.findAllById(Collections.singleton(id));
    }

    public Optional<Passenger> addPassengerToFlight(Passenger passenger) {
        return Optional.of(passengerRepository.save(passenger));
    }
}
