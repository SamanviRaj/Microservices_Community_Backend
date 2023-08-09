package com.restapi.accountservice.service;

import com.restapi.accountservice.dto.InvoiceDTO;
import com.restapi.accountservice.entity.Invoice;

import java.util.List;

public interface InvoiceService {

    public List<Invoice> getInvoices();

    public Invoice createInvoice(InvoiceDTO invoiceDTO);


}
