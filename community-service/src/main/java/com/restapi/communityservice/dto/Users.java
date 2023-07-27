package com.restapi.communityservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {

    private String firstName;
    private String lastName;
    private String password;
    private String dob;
    private String email;
    private String communityName;
    private String communityId;
}
