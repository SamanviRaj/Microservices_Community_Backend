package com.restapi.accountservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String accountName;
    @Column
    private String description;
    @Column
    private String totalBalance;
    @Column
    private String outstandingBalance;
    @Column
    private String incomeAmount;
    @Column
    private String expenseAmount;
    @Column
    private Long userId;
}
