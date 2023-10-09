package com.example.liabrarymanagementsystem.entity;

import com.example.liabrarymanagementsystem.enums.Department;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student")
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
     private int age ;

     @Enumerated(EnumType.STRING)
    private Department department;

     private String mobNo;
    @OneToOne(mappedBy = "student",cascade=CascadeType.ALL)
    Card card;
}
