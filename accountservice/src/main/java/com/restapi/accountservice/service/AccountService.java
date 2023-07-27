package com.restapi.accountservice.service;

import com.restapi.accountservice.entity.Account;

import java.util.List;

public interface AccountService {

    public List<Account> getAccounts();

    public Account getAccountById(Long id);

    public Account createAccount(Account account);

    public String deleteAccount(Long id);
}
