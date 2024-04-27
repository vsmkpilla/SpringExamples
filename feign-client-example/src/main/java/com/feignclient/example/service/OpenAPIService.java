package com.feignclient.example.service;

import com.feignclient.example.client.OpenAPIClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OpenAPIService {
    @Autowired
    private OpenAPIClient openAPIClient;

    public List<Map<String,Object>> getObjects(){
        return openAPIClient.getAllObjects();
    }
}
