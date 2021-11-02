package com.smoothstack.utopia.booking.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@ToString
@Table(name = "passenger")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Passenger {
    @Id
    private int id;
    @ManyToOne(optional = false)
    @JoinColumn(name = "booking_id")
    private Booking booking;
    private String givenName;
    private String familyName;
    private Date dob;
    private String gender;
    private String address;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return id == passenger.id && booking.equals(passenger.booking) && givenName.equals(passenger.givenName) && familyName.equals(passenger.familyName) && dob.equals(
                passenger.dob) && gender.equals(passenger.gender) && address.equals(passenger.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, booking, givenName, familyName, dob, gender, address);
    }
}
