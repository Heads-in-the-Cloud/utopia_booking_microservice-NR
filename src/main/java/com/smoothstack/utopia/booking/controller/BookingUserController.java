package com.smoothstack.utopia.booking.controller;

import com.smoothstack.utopia.booking.entity.BookingUser;
import com.smoothstack.utopia.booking.service.BookingUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/bookings/bookinguser")
public class BookingUserController {

    @Autowired
    private BookingUserService bookingUserService;

    @GetMapping(path = "/all")
    @PreAuthorize("hasAuthority('Administrator')")
    public ResponseEntity<List<BookingUser>> getAllBookingUser() {
        return ResponseEntity.ok(bookingUserService.getAllBookingUser());
    }

    @GetMapping(path = "/{id}")
    @PreAuthorize("hasAuthority('Administrator')")
    public ResponseEntity<BookingUser> getBookingUserById(@PathVariable int id) {
        Optional<BookingUser> bookingUser = bookingUserService.getBookingUserById(id);
        return bookingUser.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.badRequest().build());
    }

    @PostMapping(path = "/add")
    @PreAuthorize("hasAuthority('Administrator')")
    public ResponseEntity<BookingUser> addBookingUser(@RequestBody BookingUser bookingUser) {
        return ResponseEntity.status(201).body(bookingUserService.addBookingUser(bookingUser));
    }
}
