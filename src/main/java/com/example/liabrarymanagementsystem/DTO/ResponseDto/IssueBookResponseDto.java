package com.example.liabrarymanagementsystem.DTO.ResponseDto;

import com.example.liabrarymanagementsystem.enums.TransactionStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class IssueBookResponseDto
{
    private String transactionNumber;

    private TransactionStatus transactionStatus;

    private String bookName;
}
