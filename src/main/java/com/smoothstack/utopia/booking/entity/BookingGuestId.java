package com.smoothstack.utopia.booking.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@NoArgsConstructor
@Data
public class BookingGuestId implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private int bookingId;
}
