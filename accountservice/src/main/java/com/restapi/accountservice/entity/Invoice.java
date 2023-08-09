package com.restapi.accountservice.entity;

import com.restapi.accountservice.dto.ExpensesDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Integer invoiceNumber;

    @Column
    private String clientName;

//    @Column
//    private String currentDate;

    @Column
    private Double totalAmount;

    @Column
    private Double discountAmount;

    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Expenses> expenses = new ArrayList<>();
}
