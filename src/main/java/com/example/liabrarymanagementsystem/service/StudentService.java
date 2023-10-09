package com.example.liabrarymanagementsystem.service;

public interface StudentService
{
    public String addStudent(StudentRequestDto studentRequestDto);
    public StudentResponseDto getStudentbyId(int id);
    public UpdateStudentMobNoResponseDto updateMobNo(UpdateStudentMobRequestDto updateStudentMobRequestDto) throws StudentNotFoundException;


}
