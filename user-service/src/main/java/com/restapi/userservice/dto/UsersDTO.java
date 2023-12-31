package com.restapi.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersDTO {

    private String fullName;
    private String password;
    private String email;
    private String communityName;
    private String communityId;
}
