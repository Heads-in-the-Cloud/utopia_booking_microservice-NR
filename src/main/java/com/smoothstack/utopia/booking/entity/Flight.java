package com.smoothstack.utopia.booking.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@ToString
@Entity
@Table(name = "flight")
public class Flight {
    @Id
    private int id;
    private int routeId;
    private int airplaneId;
    private Date departureTime;
    private int reservedSeats;
    private double seatPrice;
}
