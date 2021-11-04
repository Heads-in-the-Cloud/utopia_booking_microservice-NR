package com.smoothstack.utopia.booking.service;

import com.smoothstack.utopia.booking.entity.BookingAgent;
import com.smoothstack.utopia.booking.repository.BookingAgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingAgentService {

    @Autowired
    private BookingAgentRepository bookingAgentRepository;

    public List<BookingAgent> getAllBookingAgent() {
        return bookingAgentRepository.findAll();
    }

    public Optional<BookingAgent> getBookingAgentById(int id) {
        return bookingAgentRepository.findByAgentId(id);
    }

    public BookingAgent addBookingAgent(BookingAgent bookingAgent) {
        return bookingAgentRepository.save(bookingAgent);
    }
}
