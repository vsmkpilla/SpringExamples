package com.feignclient.example.controller;


import com.feignclient.example.client.OpenAPIClient;
import com.feignclient.example.service.OpenAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class OpenAPIClientRestControler {

    @Autowired
    private OpenAPIService openAPIService;
    @GetMapping("/fetchObjects")
    public List<Map<String,Object>> fetchAllObjects(){
        return openAPIService.getObjects();
    }

}
