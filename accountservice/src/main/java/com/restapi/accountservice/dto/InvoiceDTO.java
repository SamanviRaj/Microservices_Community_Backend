package com.restapi.accountservice.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceDTO {

    private Long id;
    private Integer invoiceNumber;
    private String clientName;
    private String currentDate;
    private List<ExpensesDTO> expenses = new ArrayList<>();
    private Double totalAmount;
    private Double discountAmount;
}
