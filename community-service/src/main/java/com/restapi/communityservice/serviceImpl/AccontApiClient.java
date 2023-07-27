package com.restapi.communityservice.serviceImpl;

import com.restapi.communityservice.dto.AccountDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(url = "http://localhost:9014" , value = "Account-SERVICE")
public interface AccontApiClient {

    @PostMapping("/api/v1/accounts/create")
    AccountDTO createAcount(@RequestBody AccountDTO accountDTO);
}
