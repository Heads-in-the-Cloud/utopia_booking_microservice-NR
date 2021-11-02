package com.smoothstack.utopia.booking.repository;

import com.smoothstack.utopia.booking.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
}
