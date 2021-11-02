package com.smoothstack.utopia.booking.service;

import com.smoothstack.utopia.booking.entity.Booking;
import com.smoothstack.utopia.booking.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Booking addBooking() {
        Booking booking = new Booking();
        booking.setActive(true);
        booking.setConfirmationCode(generateRandomString());
        return bookingRepository.saveAndFlush(booking);
    }

    private String generateRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 25;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }

    public void deleteBooking(Integer id) {
        bookingRepository.deleteById(id);
    }

    public Booking updateBooking(Integer id, Booking booking) {
        booking.setId(id);
        return bookingRepository.save(booking);
    }
}
