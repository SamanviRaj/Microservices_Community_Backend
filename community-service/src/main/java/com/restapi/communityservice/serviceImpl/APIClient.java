package com.restapi.communityservice.serviceImpl;

import com.restapi.communityservice.dto.Users;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(url = "http://localhost:9012" , value = "USER-SERVICE")
public interface APIClient {
    @PostMapping("/api/v1/users/create")
    Users createUser(@RequestBody Users usersDTO);
}
