package com.smoothstack.utopia.booking.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "is_active")
    private boolean isActive;
    @Column(name = "confirmation_code")
    private String confirmationCode;

    public Booking(int id) {
        this.id = id;
    }
}
