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
public class Expenses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String label;
    @Column
    private Double amount;

    // Many-to-one relationship with Invoice
    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;

}
