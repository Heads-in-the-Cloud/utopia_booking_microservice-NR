package com.smoothstack.utopia.booking.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Table(name = "flight_bookings")
@Entity
public class FlightBookings implements Serializable {

    @ManyToOne(optional = false)
    @JoinColumn(name = "flight_id", nullable = false)
    @Id
    private Flight flight;
    @JoinColumn(name = "booking_id", nullable = false)
    private Booking booking;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightBookings that = (FlightBookings) o;
        return flight.equals(that.flight) && booking.equals(that.booking);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flight, booking);
    }
}
