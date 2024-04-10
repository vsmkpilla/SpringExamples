package com.restclient.sample.restclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;
import java.util.Map;

@Service
public class InvokeApiUsingRestClient {


    private final RestClient restClient;
    public InvokeApiUsingRestClient(){
        restClient = RestClient.builder()
                .baseUrl("https://api.restful-api.dev")
                .build();
    }


    public Map<String, Object> getObjectByID(int id){

        return restClient.get()
                .uri("/objects/"+id)
                .retrieve()
                .body(Map.class);
    }

    public List<Map<String, Object>>  getAllObjects(){

        return restClient.get()
                .uri("/objects")
                .retrieve()
                .body(List.class);
    }


}
