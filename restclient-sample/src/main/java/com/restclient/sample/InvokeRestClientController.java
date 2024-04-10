package com.restclient.sample;


import com.restclient.sample.restclient.InvokeApiUsingRestClient;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class InvokeRestClientController {

    @Autowired
    private InvokeApiUsingRestClient invokeApiUsingRestClient;


    @GetMapping("/fetch/{id}")
    public Map<String, Object> fetchObject(@PathVariable int id){
        return invokeApiUsingRestClient.getObjectByID(id);
    }

    @GetMapping("/fetchall")
    public List<Map<String, Object>> fetchAllObjects(){
        return invokeApiUsingRestClient.getAllObjects();
    }


}
