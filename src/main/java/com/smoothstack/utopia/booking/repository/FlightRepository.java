package com.smoothstack.utopia.booking.repository;

import com.smoothstack.utopia.booking.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
}
