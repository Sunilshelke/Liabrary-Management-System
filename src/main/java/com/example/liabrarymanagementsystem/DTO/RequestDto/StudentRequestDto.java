package com.example.liabrarymanagementsystem.DTO.RequestDto;

import com.example.liabrarymanagementsystem.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StudentRequestDto
{
    private  String name;
    private int age;
    private Department department;
    private String  mobNo;


}


