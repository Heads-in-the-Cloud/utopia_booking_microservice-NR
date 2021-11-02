package com.smoothstack.utopia.booking.service;

import com.smoothstack.utopia.booking.entity.BookingPayment;
import com.smoothstack.utopia.booking.repository.BookingPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingPaymentService {

    @Autowired
    private BookingPaymentRepository bookingPaymentRepository;

    public List<BookingPayment> getAllBookingPayments() {
        return bookingPaymentRepository.findAll();
    }

    public BookingPayment getBookingPaymentById(int id) {
        if (bookingPaymentRepository.existsById(id))
            return bookingPaymentRepository.getById(id);
        else return null;
    }

    public BookingPayment addBookingPayment(BookingPayment bookingPayment) {
        return bookingPaymentRepository.save(bookingPayment);
    }

    public void deleteBookingPayment(int id) {
        if (bookingPaymentRepository.existsById(id))
            bookingPaymentRepository.deleteById(id);
    }

    public BookingPayment updateBookingPayment(BookingPayment bookingPayment) {
        if (bookingPaymentRepository.existsById(bookingPayment.getBookingId()))
            return bookingPaymentRepository.save(bookingPayment);
        else return null;
    }
}
