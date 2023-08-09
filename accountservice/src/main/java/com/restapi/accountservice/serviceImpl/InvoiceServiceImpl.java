package com.restapi.accountservice.serviceImpl;

import com.restapi.accountservice.dto.ExpensesDTO;
import com.restapi.accountservice.dto.InvoiceDTO;
import com.restapi.accountservice.entity.Expenses;
import com.restapi.accountservice.entity.Invoice;
import com.restapi.accountservice.repository.ExpenseRepository;
import com.restapi.accountservice.repository.InvoiceRepository;
import com.restapi.accountservice.service.InvoiceService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    InvoiceRepository invoiceRepository;

    @Autowired
    ExpenseRepository expenseRepository;

    ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<Invoice> getInvoices() {
        return invoiceRepository.findAll();
    }

    @Override
    public Invoice createInvoice(InvoiceDTO invoiceDTO) {
        Invoice invoice = new Invoice();
        invoice.setInvoiceNumber(invoiceDTO.getInvoiceNumber());
        invoice.setClientName(invoiceDTO.getClientName());
//        invoice.setCurrentDate(invoiceDTO.getCurrentDate());
        invoice.setDiscountAmount(invoiceDTO.getDiscountAmount());

        List<Expenses> expenses = new ArrayList<>();
        for (ExpensesDTO expenseDTO : invoiceDTO.getExpenses()) {
            Expenses expense = new Expenses();
            expense.setLabel(expenseDTO.getLabel());
            expense.setAmount(expenseDTO.getAmount());
            expense.setInvoice(invoice); // Associate the expense with the invoice
            expenses.add(expense);
        }

        invoice.setExpenses(expenses);
        invoice.setTotalAmount(invoiceDTO.getTotalAmount());

        // Save the invoice first to generate its ID
        Invoice savedInvoice = invoiceRepository.save(invoice);

        // Set the invoice reference for each expense and save them
        for (Expenses expense : expenses) {
            expense.setInvoice(savedInvoice);
            expenseRepository.save(expense);
        }

        return savedInvoice;
    }
}
