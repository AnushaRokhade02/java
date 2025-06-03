package com.kle.bookstore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

import java.math.BigDecimal;

@Entity
@IdClass(TransactionDetailsId.class)
public class TransactionDetails {
    @Id
    private String transactionId;

    @Id
    private String bookId;

    private int quantity;
    private BigDecimal subTotal;

    // Getters and Setters
}


