package com.smoothstack.utopia.booking.service;

import com.smoothstack.utopia.booking.entity.Passenger;
import com.smoothstack.utopia.booking.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;

    public List<Passenger> getPassengersByFlightId(int id) {
        return passengerRepository.findAllById(Collections.singleton(id));
    }

    public Optional<Passenger> getPassengerById(int id) {
        if (passengerRepository.existsById(id))
            return Optional.of(passengerRepository.getById(id));
        else return Optional.empty();
    }

    public Passenger addPassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    }

    public Passenger updatePassenger(int id, Passenger passenger) {
        passenger.setId(id);
        return passengerRepository.save(passenger);
    }

    public void deletePassenger(int id) {
        passengerRepository.deleteById(id);
    }
}
