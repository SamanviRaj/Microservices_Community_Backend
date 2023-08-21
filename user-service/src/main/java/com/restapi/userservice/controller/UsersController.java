package com.restapi.userservice.controller;

import com.restapi.userservice.apputils.AppUtils;
import com.restapi.userservice.dto.SignInRequest;
import com.restapi.userservice.dto.UsersDTO;
import com.restapi.userservice.entity.Users;
import com.restapi.userservice.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
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

    @PostMapping("/signin")
    public ResponseEntity<UsersDTO> signIn(@RequestBody SignInRequest signInRequest) {
        try {
            String email = signInRequest.getEmail();
            String password = signInRequest.getPassword();

            // Validate the user's credentials
            Users user = usersService.findUserByEmail(email);

            if (user != null && passwordMatches(user, password)) {
                UsersDTO usersDTO = AppUtils.mapToUsersSignin(user);
                return ResponseEntity.ok(usersDTO);
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }

    private boolean passwordMatches(Users user, String password) {
        // Here, you should use a secure password hashing library to compare passwords.
        // For example, you can use BCryptPasswordEncoder.
        // For demonstration purposes, I'll assume a plain text comparison (not secure).
        return user.getPassword().equals(password);
    }

}
