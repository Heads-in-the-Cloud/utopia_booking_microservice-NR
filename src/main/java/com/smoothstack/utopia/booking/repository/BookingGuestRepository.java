package com.smoothstack.utopia.booking.repository;

import com.smoothstack.utopia.booking.entity.BookingGuest;
import com.smoothstack.utopia.booking.entity.BookingGuestId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingGuestRepository extends JpaRepository<BookingGuest, BookingGuestId> {
    Optional<BookingGuest> findByBookingId(int bookingId);
}
