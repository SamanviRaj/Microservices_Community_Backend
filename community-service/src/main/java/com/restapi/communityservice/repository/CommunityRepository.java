package com.restapi.communityservice.repository;

import com.restapi.communityservice.entity.Community;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunityRepository extends JpaRepository<Community,Long> {
}
