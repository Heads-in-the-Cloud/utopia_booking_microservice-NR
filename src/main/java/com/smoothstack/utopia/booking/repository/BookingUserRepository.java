package com.smoothstack.utopia.booking.repository;

import com.smoothstack.utopia.booking.entity.BookingUser;
import com.smoothstack.utopia.booking.entity.BookingUserId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingUserRepository extends JpaRepository<BookingUser, BookingUserId> {

    Optional<BookingUser> findByUserId(int id);
}
