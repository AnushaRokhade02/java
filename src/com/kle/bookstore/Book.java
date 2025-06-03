package com.kle.bookstore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    private String bookId;
    private String title;
    private String author;
    private String genre;
    private float price;
    private int stockQuantity;

    // Getters and Setters
}
