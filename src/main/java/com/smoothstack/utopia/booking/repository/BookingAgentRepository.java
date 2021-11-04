package com.smoothstack.utopia.booking.repository;

import com.smoothstack.utopia.booking.entity.BookingAgent;
import com.smoothstack.utopia.booking.entity.BookingAgentId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingAgentRepository extends JpaRepository<BookingAgent, BookingAgentId> {

    Optional<BookingAgent> findByAgentId(int id);
}
