package com.thirdpartyAPI.integration.postservice;

import java.util.List;
import java.util.Map;

public interface PostService {
    //Creating a method to handle the response from Thirdparty API
    List<Map<String, Object>> getPosts();
    Map<String, Object> getPostByID(Integer id);

    Map<String, Object> inserPost(Map<String, Object> reqPayload);

    Map<String, Object> updatePost(Map<String, Object> payload,Integer id);


    Map<String, Object> deletePostByID(Integer id);
}

