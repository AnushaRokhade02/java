package com.kle.bookstore;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class TransactionRecord {
    @Id
    private String transactionId;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private Date transactionDate;
    private BigDecimal totalAmount;

    // Getters and Setters
}

