package com.restapi.accountservice.apputils;

import com.restapi.accountservice.dto.AccountDTO;
import com.restapi.accountservice.dto.ExpensesDTO;
import com.restapi.accountservice.dto.InvoiceDTO;
import com.restapi.accountservice.entity.Account;
import com.restapi.accountservice.entity.Invoice;

public class AppUtils {

    public static AccountDTO mapToAccountDTO(Account account){
       AccountDTO dtoObj = new AccountDTO();
       dtoObj.setAccountName(account.getAccountName());
       dtoObj.setDescription(account.getDescription());
       dtoObj.setOutstandingBalance(account.getOutstandingBalance());
       dtoObj.setIncomeAmount(account.getIncomeAmount());
       dtoObj.setExpenseAmount(account.getExpenseAmount());
       dtoObj.setUserId(account.getUserId());
       dtoObj.setTotalBalance(account.getTotalBalance());
        return dtoObj;
    }

    public static Account mapToAccountEntity(AccountDTO accountDTO){
        Account entityObj = new Account();
        entityObj.setAccountName(accountDTO.getAccountName());
        entityObj.setDescription(accountDTO.getDescription());
        entityObj.setOutstandingBalance(accountDTO.getOutstandingBalance());
        entityObj.setIncomeAmount(accountDTO.getIncomeAmount());
        entityObj.setExpenseAmount(accountDTO.getExpenseAmount());
        entityObj.setUserId(accountDTO.getUserId());
        entityObj.setTotalBalance(accountDTO.getTotalBalance());
        return entityObj;
    }

    public static InvoiceDTO mapToInvoiceDTO(Invoice invoice){
        InvoiceDTO dtoObj = new InvoiceDTO();
        dtoObj.setId(invoice.getId());
//        dtoObj.setExpenses(invoice.getExpenses());

        dtoObj.setClientName(invoice.getClientName());
//        dtoObj.setCurrentDate(invoice.getCurrentDate());
        dtoObj.setInvoiceNumber(invoice.getInvoiceNumber());
        dtoObj.setDiscountAmount(invoice.getDiscountAmount());
        dtoObj.setTotalAmount(invoice.getTotalAmount());
        return dtoObj;
    }

    public static Invoice mapToInvoiceEntity(InvoiceDTO invoiceDTO){
        Invoice entityObj = new Invoice();
        entityObj.setId(invoiceDTO.getId());
//        entityObj.setExpenses(invoiceDTO.getExpenses());
        entityObj.setClientName(invoiceDTO.getClientName());
//        entityObj.setCurrentDate(invoiceDTO.getCurrentDate());
        entityObj.setInvoiceNumber(invoiceDTO.getInvoiceNumber());
        entityObj.setDiscountAmount(invoiceDTO.getDiscountAmount());
        entityObj.setTotalAmount(invoiceDTO.getTotalAmount());
        return entityObj;
    }
}
