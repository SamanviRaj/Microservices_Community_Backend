package com.restapi.communityservice.service;

import com.restapi.communityservice.dto.CommunityDTO;
import com.restapi.communityservice.entity.Community;

import java.util.List;

public interface CommunityService {

    public List<Community> getCommunities();

    public Community createCommunity(CommunityDTO communityDTO);


}
