package com.restapi.accountservice.controller;

import com.restapi.accountservice.apputils.AppUtils;
import com.restapi.accountservice.dto.AccountDTO;
import com.restapi.accountservice.dto.InvoiceDTO;
import com.restapi.accountservice.entity.Account;
import com.restapi.accountservice.entity.Invoice;
import com.restapi.accountservice.service.AccountService;
import com.restapi.accountservice.service.InvoiceService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.modelmapper.ModelMapper;

import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping("api/v1/invoice")
@CrossOrigin
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    ModelMapper modelMapper = new ModelMapper();

    // Mapping from entity to DTO
//    Expense expenseEntity = /* ... */;
//    ExpenseDTO expenseDTO = modelMapper.map(expenseEntity, ExpenseDTO.class);

    // Mapping from DTO to entity
//    ExpenseDTO expenseDTO = /* ... */;
//    Expense expenseEntity = modelMapper.map(expenseDTO, Expense.class);

    @GetMapping
    public ResponseEntity<List<Invoice>> getInvoices(){
        return new ResponseEntity<>(invoiceService.getInvoices(), HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Invoice> createInvoice(@RequestBody InvoiceDTO invoiceDTO){

        try {
           Invoice invoice = invoiceService.createInvoice(invoiceDTO);
            return ResponseEntity.ok(invoice);
        } catch (Exception e) {
           e.printStackTrace();
        }
    return null;
//        return new ResponseEntity<>(invoiceService.createInvoice(modelMapper.map(invoiceDTO, Invoice.class)),HttpStatus.OK);
    }
}
