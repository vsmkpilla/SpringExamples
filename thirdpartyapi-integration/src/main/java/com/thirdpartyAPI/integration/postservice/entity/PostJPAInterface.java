package com.thirdpartyAPI.integration.postservice.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostJPAInterface extends JpaRepository<Post, Long> {
}
