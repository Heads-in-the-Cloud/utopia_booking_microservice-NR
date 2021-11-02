package com.smoothstack.utopia.booking.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Table(name = "booking_user")
@Entity
public class BookingUser implements Serializable {
    @ManyToOne(optional = false)
    @JoinColumn(name = "booking_id", nullable = false)
    @Id
    private Booking bookingId;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookingUser that = (BookingUser) o;
        return bookingId.equals(that.bookingId) && userId.equals(that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, userId);
    }
}
