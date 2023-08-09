package com.restapi.accountservice.repository;

import com.restapi.accountservice.entity.Expenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expenses, Long> {
    // You can add custom query methods here if needed
}

