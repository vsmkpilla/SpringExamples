package com.thirdpartyAPI.integration.message.controller;

import com.thirdpartyAPI.integration.message.impl.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class MessageController {

    @Autowired
    MessageServiceImpl messageServiceImpl;

    @GetMapping("/fetchall")
    public List<Map<String, Object>> getAllMsgs(){
        return messageServiceImpl.getAllMessages();
    }

}
