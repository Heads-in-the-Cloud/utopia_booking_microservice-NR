package com.smoothstack.utopia.booking.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Table(name = "booking_agent")
@Entity
@IdClass(BookingAgentId.class)
public class BookingAgent implements Serializable {
    @ManyToOne(optional = false)
    @JoinColumn(name = "booking_id", nullable = false)
    @Id
    private Booking bookingId;
    @Id
    private int agentId;

    //    @Override
    //    public boolean equals(Object o) {
    //        if (this == o) return true;
    //        if (o == null || getClass() != o.getClass()) return false;
    //        BookingAgent that = (BookingAgent) o;
    //        return bookingId.equals(that.bookingId) && agentId.equals(that.agentId);
    //    }
    //
    //    @Override
    //    public int hashCode() {
    //        return Objects.hash(bookingId, agentId);
    //    }
}
