package com.restapi.communityservice.appUtils;

import com.restapi.communityservice.dto.CommunityDTO;
import com.restapi.communityservice.entity.Community;

public class AppUtils {

    public static CommunityDTO mapToCommunityDTO(Community community){
        CommunityDTO dtoObj = new CommunityDTO();
        dtoObj.setCommunityName(community.getCommunityName());
        dtoObj.setCreatedDate(community.getCreatedDate());
        return dtoObj;
    }

    public static Community mapToCommunityEntity(CommunityDTO communityDTO){
        Community entityObj = new Community();
        entityObj.setCommunityName(communityDTO.getCommunityName());
        entityObj.setCreatedDate(communityDTO.getCreatedDate());
        return entityObj;
    }
}

