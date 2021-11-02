package com.smoothstack.utopia.booking.repository;

import com.smoothstack.utopia.booking.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {
}
