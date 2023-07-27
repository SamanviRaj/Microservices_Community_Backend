package com.restapi.accountservice.apputils;

import com.restapi.accountservice.dto.AccountDTO;
import com.restapi.accountservice.entity.Account;

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
}
