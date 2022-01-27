package com.smoothstack.utopia.booking.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Table(name = "booking_user")
@Entity
@IdClass(BookingUserId.class)
public class BookingUser implements Serializable {
    @ManyToOne(optional = false)
    @JoinColumn(name = "booking_id", nullable = false)
    @Id
    private Booking bookingId;
    @Id
    private int userId;
}
