package com.restapi.userservice.controller;

import com.restapi.userservice.apputils.AppUtils;
import com.restapi.userservice.dto.UsersDTO;
import com.restapi.userservice.entity.Users;
import com.restapi.userservice.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/users")
public class UsersController {

    @Autowired
    private UsersService usersService;
    @GetMapping
    public ResponseEntity<List<Users>> getTodos(){
        return new ResponseEntity<>(usersService.getUsers(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<UsersDTO> createUser(@RequestBody UsersDTO usersDTO){
        System.out.println("!!! creating User"+usersDTO);
        Users user = usersService.createUser(usersDTO);
        UsersDTO usersDTO1 = AppUtils.mapToUsersDTO(user);
        return new ResponseEntity<>(usersDTO1, HttpStatus.OK);
    }
    
}
