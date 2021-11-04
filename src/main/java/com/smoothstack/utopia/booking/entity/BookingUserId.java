package com.smoothstack.utopia.booking.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@NoArgsConstructor
@Data
public class BookingUserId implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private int userId;
    private int bookingId;
}
