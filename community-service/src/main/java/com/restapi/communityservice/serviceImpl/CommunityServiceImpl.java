package com.restapi.communityservice.serviceImpl;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.restapi.communityservice.appUtils.AppUtils;
import com.restapi.communityservice.dto.AccountDTO;
import com.restapi.communityservice.dto.CommunityDTO;
import com.restapi.communityservice.dto.Users;
import com.restapi.communityservice.entity.Community;
import com.restapi.communityservice.repository.CommunityRepository;
import com.restapi.communityservice.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommunityServiceImpl implements CommunityService {

    @Autowired
    private CommunityRepository communityRepository;
    @Autowired
    private APIClient apiClient;

    @Autowired
    private AccontApiClient accontApiClient;

    @Override
    public List<Community> getCommunities() {
        return communityRepository.findAll();
    }

    @Override
    public Community createCommunity(CommunityDTO communityDTO) {
        Community community = AppUtils.mapToCommunityEntity(communityDTO);
        Users user = apiClient.createUser(communityDTO.getUsers());
        AccountDTO acObj = new AccountDTO();
        acObj.setAccountName(communityDTO.getCommunityName());
        AccountDTO acount = accontApiClient.createAcount(acObj);
        return communityRepository.save(community);
    }
}
