package com.restapi.communityservice.controller;

import com.restapi.communityservice.dto.CommunityDTO;
import com.restapi.communityservice.entity.Community;
import com.restapi.communityservice.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/community")
public class CommunityController {

    @Autowired
    private CommunityService communityService;
    @GetMapping
    public ResponseEntity<List<Community>> getCommunityList(){
        return new ResponseEntity<>(communityService.getCommunities(), HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Community> createCommunity(@RequestBody CommunityDTO communityDTO){
        return  new ResponseEntity<>(communityService.createCommunity(communityDTO),HttpStatus.OK);
    }
}
