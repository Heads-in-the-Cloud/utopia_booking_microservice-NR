package com.smoothstack.utopia.booking.service;

import com.smoothstack.utopia.booking.entity.BookingUser;
import com.smoothstack.utopia.booking.repository.BookingUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingUserService {

    @Autowired
    private BookingUserRepository bookingUserRepository;

    public List<BookingUser> getAllBookingUser() {
        return bookingUserRepository.findAll();
    }

    public Optional<BookingUser> getBookingUserById(int id) {
        return bookingUserRepository.findByUserId(id);
    }

    public BookingUser addBookingUser(BookingUser bookingUser) {
        return bookingUserRepository.save(bookingUser);
    }
}
