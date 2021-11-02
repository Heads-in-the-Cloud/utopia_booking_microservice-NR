package com.smoothstack.utopia.booking.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@ToString
@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @Id
    private int id;
    private int roleId;
    private String givenName;
    private String familyName;
    private String username;
    private String email;
    private String password;
    private String phone;
}
