package com.thirdpartyAPI.integration.message.impl;

import com.thirdpartyAPI.integration.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class MessageServiceImpl implements Message {

    private final String baseUrl = "https://api.restful-api.dev/";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Map<String, Object>> getAllMessages() {
        String allPostUri = baseUrl+"/objects";
        HttpEntity<Void> httpEntity = new HttpEntity<>(getAllHeader());
        var response = restTemplate.exchange(allPostUri,HttpMethod.GET,httpEntity,List.class);
        return response.getBody();
    }


    public HttpHeaders getAllHeader(){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        return httpHeaders;
    }
}
