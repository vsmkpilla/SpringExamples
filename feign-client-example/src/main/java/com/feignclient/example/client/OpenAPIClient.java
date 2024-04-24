package com.feignclient.example.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@FeignClient(name="openAPI", url = "https://api.restful-api.dev")
public interface OpenAPIClient {

    @GetMapping("/objects")
    public List<Map<String,Object>> getAllObjects();
}
