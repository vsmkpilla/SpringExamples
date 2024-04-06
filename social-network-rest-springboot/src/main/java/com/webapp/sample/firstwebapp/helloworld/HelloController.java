package com.webapp.sample.firstwebapp.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("sayhello")
    @ResponseBody
    public String sayHello(){
        return "Sayhello";
    }
    @RequestMapping("sayhellojsp")
    public String sayHelloJSP(){
        return "sayhello";
    }
}
