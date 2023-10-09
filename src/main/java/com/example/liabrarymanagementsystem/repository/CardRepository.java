package com.example.liabrarymanagementsystem.repository;

import com.example.liabrarymanagementsystem.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card ,Integer>
{

}
