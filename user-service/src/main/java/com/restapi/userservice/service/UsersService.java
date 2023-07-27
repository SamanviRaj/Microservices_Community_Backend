package com.restapi.userservice.service;

import com.restapi.userservice.dto.UsersDTO;
import com.restapi.userservice.entity.Users;

import java.util.List;

public interface UsersService {

    public List<Users> getUsers();

    public Users getUserById(Long id);

    public Users createUser(UsersDTO usersDTO);

    public Users updateUser(UsersDTO usersDTO);

    public Users deleteUser(Long id);

}
