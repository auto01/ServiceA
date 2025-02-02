package com.example.servicea.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class userController {

    @Value("${PORT_VAL}")
    private String port_val;

    @RequestMapping("/helloA")
    public String helloA(){
        System.out.println("inside helloA controller of service A");
        System.out.println("hello A.....");
        return "hello A from port:"+port_val;
        //ResponseEntity<Map<String,String>> responseEntity=
    }
}
