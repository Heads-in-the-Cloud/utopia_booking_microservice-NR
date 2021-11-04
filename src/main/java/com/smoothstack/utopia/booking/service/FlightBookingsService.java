package com.smoothstack.utopia.booking.service;

import com.smoothstack.utopia.booking.entity.FlightBookings;
import com.smoothstack.utopia.booking.repository.FlightBookingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightBookingsService {

    @Autowired
    private FlightBookingsRepository flightBookingsRepository;

    public List<FlightBookings> getAllFlightBookings() {
        return flightBookingsRepository.findAll();
    }

    public FlightBookings addFlightBooking(FlightBookings flightBookings) {
        return flightBookingsRepository.save(flightBookings);
    }

    public FlightBookings getFlightBookingByFlightId(int id) {
        return flightBookingsRepository.findByFlightId(id);
    }

    public FlightBookings getFlightBookingByBookingId(int id) {
        return flightBookingsRepository.findByBookingId(id);
    }
}
