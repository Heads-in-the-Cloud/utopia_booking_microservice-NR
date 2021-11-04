package com.smoothstack.utopia.booking.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@NoArgsConstructor
@Data
public class BookingAgentId implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private int agentId;
    private int bookingId;
}
