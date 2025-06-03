package com.kle.bookstore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Customer {
    @Id
    private String customerId;
    private String name;
    private String email;
    private String phoneNo;
    private Date joinDate;

    // Getters and Setters
}
