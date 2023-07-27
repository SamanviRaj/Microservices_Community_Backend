package com.restapi.userservice.apputils;

import com.restapi.userservice.dto.UsersDTO;
import com.restapi.userservice.entity.Users;

public class AppUtils {

    public static UsersDTO mapToUsersDTO(Users users){
        UsersDTO dtoObj = new UsersDTO();
        dtoObj.setFirstName(users.getFirstName());
        dtoObj.setLastName(users.getLasttName());
        dtoObj.setPassword(users.getPassword());
        dtoObj.setDob(users.getDob());
        dtoObj.setEmail(users.getEmail());
        return dtoObj;
    }

    public static Users mapToUsersEntity(UsersDTO usersDTO){
        Users entityObj = new Users();
        entityObj.setFirstName(usersDTO.getFirstName());
        entityObj.setLasttName(usersDTO.getLastName());
        entityObj.setPassword(usersDTO.getPassword());
        entityObj.setDob(usersDTO.getDob());
        entityObj.setEmail(usersDTO.getEmail());
        return entityObj;
    }


}
