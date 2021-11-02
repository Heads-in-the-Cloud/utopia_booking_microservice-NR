package com.smoothstack.utopia.booking.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Table(name = "booking_guest")
@Entity
public class BookingGuest implements Serializable {
    @ManyToOne(optional = false)
    @JoinColumn(name = "booking_id", nullable = false)
    @Id
    private Booking booking;
    private String contactEmail;
    private String contactPhone;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookingGuest that = (BookingGuest) o;
        return booking.equals(that.booking) && contactEmail.equals(that.contactEmail) && contactPhone.equals(that.contactPhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(booking, contactEmail, contactPhone);
    }
}
