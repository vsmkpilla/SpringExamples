package com.thirdpartyAPI.integration.postservice.impl;

import com.thirdpartyAPI.integration.postservice.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class PostServiceImpl implements PostService {

    private String baseUri = "https://jsonplaceholder.typicode.com";
    private String posts = "/posts";
    private String postByID = "/posts/";

    StringBuilder uriBuilder = new StringBuilder(baseUri);

    @Autowired
    private RestTemplate restTemplate;

    //Implementing the RestTemplate to receive the Posts details from third party API
    @Override
    public List<Map<String, Object>> getPosts() {
        //We need URI, HTTP.METHD, HTTP.ENTITY(Body,headers) and Type of class
        //Then we call exchange method with all the above params
        String url = uriBuilder.toString()+posts;
        HttpEntity<Void> httpEntity = new HttpEntity<>(getHeaders());
        var responsedata = restTemplate.exchange(url, HttpMethod.GET,httpEntity,List.class);
        return responsedata.getBody();
    }

    @Override
    public Map<String, Object> getPostByID(Integer id) {
        String url = uriBuilder.toString()+postByID+id.toString();
        HttpEntity<Void> httpEntity = new HttpEntity<>(getHeaders());
        var response = restTemplate.exchange(url,HttpMethod.GET,httpEntity,Map.class);
        return response.getBody();
    }

    @Override
    public Map<String, Object> inserPost(Map<String, Object> reqPayload) {
        String url = uriBuilder.toString()+posts;
        HttpEntity<Map> httpEntity = new HttpEntity<>(reqPayload,getHeaders());
        var response = restTemplate.exchange(url,HttpMethod.POST,httpEntity,Map.class);
        return response.getBody();
    }

    @Override
    public Map<String, Object> updatePost(Map<String, Object> reqPayload, Integer id) {
        String url =uriBuilder.toString()+postByID+id.toString();
        HttpEntity<Map> httpEntity = new HttpEntity<>(reqPayload,getHeaders());
        var response = restTemplate.exchange(url,HttpMethod.PUT,httpEntity,Map.class);
        return response.getBody();
    }

    @Override
    public Map<String, Object> deletePostByID(Integer id) {
        String url =uriBuilder.toString()+postByID+id.toString();
        HttpEntity<Map> httpEntity = new HttpEntity<>(getHeaders());
        var response = restTemplate.exchange(url,HttpMethod.DELETE,httpEntity,Map.class);
        return response.getBody();
    }

    private HttpHeaders getHeaders(){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        return httpHeaders;
    }
}
