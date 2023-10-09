package com.example.liabrarymanagementsystem.controller;

import com.example.liabrarymanagementsystem.DTO.ResponseDto.IssueBookResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

public class TransactionController
{
    @Autowired
    TransactionService transactionService;

    @PostMapping("/add")
    public IssueBookResponseDto issueBook(com.example.librarymanagementsystemapril.DTO.RequestDto.IssueBookRequestDto issueBookRequestDto) throws Exception {

        return transactionService.issueBook(issueBookRequestDto);
    }
}
