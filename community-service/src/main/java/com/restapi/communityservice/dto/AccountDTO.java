package com.restapi.communityservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {

    private String accountName;
    private String description;
    private String totalBalance;
    private String outstandingBalance;
    private String incomeAmount;
    private String expenseAmount;
    private Long userId;

}
