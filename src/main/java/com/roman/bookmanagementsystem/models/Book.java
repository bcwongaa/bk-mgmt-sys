package com.roman.bookmanagementsystem.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    public void setTitle(String title) {
        if (title == null || title.matches("^[a-zA-Z0-9]+$")) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Title must be alphanumeric");
        }
    }

    @Column(nullable = false)
    private String author;

    public void setAuthor(String author) {
        if (author == null || author.matches("^[a-zA-Z0-9]+$")) {
            this.author = author;
        } else {
            throw new IllegalArgumentException("Author must be alphanumeric");
        }
    }

    @Column(nullable = false)
    private Boolean published;
}