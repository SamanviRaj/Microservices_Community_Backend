package com.restapi.accountservice.controller;

import com.restapi.accountservice.apputils.AppUtils;
import com.restapi.accountservice.dto.AccountDTO;
import com.restapi.accountservice.entity.Account;
import com.restapi.accountservice.service.AccountService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping("api/v1/accounts")
public class AccountsController {

    @Autowired
    private AccountService accountService;

    @GetMapping
    public ResponseEntity<List<Account>> getAccounts(){
        return new ResponseEntity<>(accountService.getAccounts(), HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Account> createAcount(@RequestBody AccountDTO accountDTO){
        return new ResponseEntity<>(accountService.createAccount(AppUtils.mapToAccountEntity(accountDTO)),HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteAccount(@PathVariable Long id){
        accountService.deleteAccount(id);
        return new ResponseEntity<>("Transaction deleted Sucessfully",HttpStatus.OK);
    }
}
