package com.kle.bookstore;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public class TransactionDetailsId implements Serializable {
    private String transactionId;
    private String bookId;

    // equals() and hashCode()
}
