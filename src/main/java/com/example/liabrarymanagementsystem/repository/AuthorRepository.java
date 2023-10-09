package com.example.liabrarymanagementsystem.repository;

import com.example.liabrarymanagementsystem.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer>
{
    Author findByEmail(String email);
}
