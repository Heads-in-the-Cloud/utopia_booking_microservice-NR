package com.smoothstack.utopia.booking.service;

import com.smoothstack.utopia.booking.entity.BookingGuest;
import com.smoothstack.utopia.booking.repository.BookingGuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingGuestService {

    @Autowired
    private BookingGuestRepository bookingGuestRepository;

    public List<BookingGuest> getAllBookingGuest() {
        return bookingGuestRepository.findAll();
    }

    public Optional<BookingGuest> getBookingGuestById(int id) {
        return bookingGuestRepository.findByBookingId(id);
    }

    public BookingGuest addBookingGuest(BookingGuest bookingGuest) {
        return bookingGuestRepository.save(bookingGuest);
    }
}
