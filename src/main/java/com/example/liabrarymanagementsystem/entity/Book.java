package com.example.liabrarymanagementsystem.entity;

import com.example.liabrarymanagementsystem.enums.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="book")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String  title;

    @Enumerated(EnumType.STRING)
    private Genre genere;
    private int  numberOfPages;
    private int price;

    @ManyToOne
    @JoinColumn
    Author author;
}
