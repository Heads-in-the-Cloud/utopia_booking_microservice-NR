package com.smoothstack.utopia.booking.controller;

import com.smoothstack.utopia.booking.entity.BookingPayment;
import com.smoothstack.utopia.booking.service.BookingPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/bookings/payment")
public class BookingPaymentController {

    @Autowired
    private BookingPaymentService bookingPaymentService;

    @GetMapping(path = "/all")
    @PreAuthorize("hasAuthority('Administrator')")
    public ResponseEntity<List<BookingPayment>> getAllBookingPayments() {
        return ResponseEntity.ok(bookingPaymentService.getAllBookingPayments());
    }

    @GetMapping(path = "/{id}")
    @PreAuthorize("hasAuthority('Administrator')")
    public ResponseEntity<BookingPayment> getBookingPaymentById(@PathVariable int id) {
        BookingPayment bp = bookingPaymentService.getBookingPaymentById(id);
        if (bp != null)
            return ResponseEntity.ok(bp);
        else return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    @PostMapping(path = "/add")
    @PreAuthorize("hasAuthority('Administrator')")
    public ResponseEntity<BookingPayment> addBookingPayment(@RequestBody BookingPayment bookingPayment) {
        return ResponseEntity.status(201).body(bookingPaymentService.addBookingPayment(bookingPayment));
    }

    @DeleteMapping(path = "/delete/{id}")
    @PreAuthorize("hasAuthority('Administrator')")
    public ResponseEntity<BookingPayment> deleteBookingPayment(@PathVariable int id) {
        bookingPaymentService.deleteBookingPayment(id);
        return ResponseEntity.ok(null);
    }

    @PutMapping(path = "/update")
    @PreAuthorize("hasAuthority('Administrator')")
    public ResponseEntity<BookingPayment> updateBookingPayment(@RequestBody BookingPayment bookingPayment) {
        return ResponseEntity.ok(bookingPaymentService.updateBookingPayment(bookingPayment));
    }
}
