package com.restapi.communityservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommunityDTO {

    private String communityName;
    private String createdDate;
    private Users users;
}
