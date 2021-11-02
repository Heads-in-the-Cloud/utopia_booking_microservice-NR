package com.smoothstack.utopia.booking.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Table(name = "booking_payment")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class BookingPayment implements Serializable {
    @Id
    private int bookingId;
    @Column(name = "stripe_id")
    private String stripeId;
    @Column(name = "refunded")
    private boolean refunded;
}
