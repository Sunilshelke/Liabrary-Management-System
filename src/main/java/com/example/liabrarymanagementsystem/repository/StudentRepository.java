package com.example.liabrarymanagementsystem.repository;

import com.example.liabrarymanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer>
{

}
