package com.smoothstack.utopia.booking.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Data
public class FlightBookingsId implements Serializable {

    private static final long serialVersionUID = 1L;

    private int flightId;
    private int bookingId;
}
