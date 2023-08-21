package com.restapi.userservice.apputils;

import com.restapi.userservice.dto.UsersDTO;
import com.restapi.userservice.entity.Users;

public class AppUtils {

    public static UsersDTO mapToUsersDTO(Users users){
        UsersDTO dtoObj = new UsersDTO();
        dtoObj.setFullName(users.getFullName());
        dtoObj.setPassword(users.getPassword());
        dtoObj.setEmail(users.getEmail());
        return dtoObj;
    }

    public static Users mapToUsersEntity(UsersDTO usersDTO){
        Users entityObj = new Users();
        entityObj.setFullName(usersDTO.getFullName());
        entityObj.setPassword(usersDTO.getPassword());
        entityObj.setEmail(usersDTO.getEmail());
        return entityObj;
    }

    public static UsersDTO mapToUsersSignin(Users users){
        UsersDTO dtoObj = new UsersDTO();
        dtoObj.setPassword(users.getPassword());
        dtoObj.setEmail(users.getEmail());
        return dtoObj;
    }

}
