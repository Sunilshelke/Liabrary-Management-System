package com.example.liabrarymanagementsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.transaction.TransactionStatus;

import java.util.Date;

@Entity /// create the table in sql
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "transaction")// change the table name in sql
public class Transaction
{
    @Id// for the primary key in sql
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String transactionNumber;

    @CreationTimestamp/// for the date feature
    private Date transactionDate;
    private boolean isIsssueOpration;

    @Enumerated(EnumType.STRING)
    private TransactionStatus transactionStatus;


    @ManyToOne// use cardianility relation to join the table card and transaction
    @JoinColumn
    Card card;

    @ManyToOne
    @JoinColumn
    Book book;



}
