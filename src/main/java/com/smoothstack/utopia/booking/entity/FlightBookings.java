package com.smoothstack.utopia.booking.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Table(name = "flight_bookings")
@Entity
@IdClass(FlightBookingsId.class)
public class FlightBookings implements Serializable {

    @ManyToOne(optional = false)
    @JoinColumn(name = "booking_id", nullable = false)
    @Id
    private Booking bookingId;
    @Id
    private int flightId;
}