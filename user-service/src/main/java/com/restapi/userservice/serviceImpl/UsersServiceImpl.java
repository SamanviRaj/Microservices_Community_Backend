package com.restapi.userservice.serviceImpl;

import com.restapi.userservice.apputils.AppUtils;
import com.restapi.userservice.dto.UsersDTO;
import com.restapi.userservice.entity.Users;
import com.restapi.userservice.repository.UsersRepository;
import com.restapi.userservice.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersRepository usersRepository;
    @Override
    public List<Users> getUsers() {
        return usersRepository.findAll();
    }

    @Override
    public Users getUserById(Long id) {
        return usersRepository.findById(id).get();
    }

    @Override
    public Users createUser(UsersDTO usersDTO) {
        Users users = AppUtils.mapToUsersEntity(usersDTO);
        return usersRepository.save(users);
    }

    @Override
    public Users updateUser(UsersDTO usersDTO) {
        Users users = AppUtils.mapToUsersEntity(usersDTO);
        return null;
    }

    @Override
    public Users deleteUser(Long id) {
        return null;
    }

    @Override
    public Users findUserByEmailAndPassword(String email, String password) {
        return usersRepository.findByEmailAndPassword(email, password);
    }

    @Override
    public Users findUserByEmail(String email) {
        return null;
    }
}
