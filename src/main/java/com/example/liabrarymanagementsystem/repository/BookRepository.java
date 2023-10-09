package com.example.liabrarymanagementsystem.repository;

import com.example.liabrarymanagementsystem.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer>
{

}
