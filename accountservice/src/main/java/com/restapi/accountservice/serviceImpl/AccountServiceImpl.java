package com.restapi.accountservice.serviceImpl;

import com.restapi.accountservice.entity.Account;
import com.restapi.accountservice.repository.AccountRepository;
import com.restapi.accountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;
    @Override
    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account getAccountById(Long id) {
        return accountRepository.findById(id).get();
    }

    @Override
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public String deleteAccount(Long id) {
        accountRepository.deleteById(id);
        return "Account Delete Successfully";
    }
}
