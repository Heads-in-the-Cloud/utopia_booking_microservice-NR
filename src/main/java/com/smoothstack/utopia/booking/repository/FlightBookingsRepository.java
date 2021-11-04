package com.smoothstack.utopia.booking.repository;

import com.smoothstack.utopia.booking.entity.FlightBookings;
import com.smoothstack.utopia.booking.entity.FlightBookingsId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightBookingsRepository extends JpaRepository<FlightBookings, FlightBookingsId> {

    FlightBookings findByFlightId(int flightId);

    FlightBookings findByBookingId(int bookingId);
}
