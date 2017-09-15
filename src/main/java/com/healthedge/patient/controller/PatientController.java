package com.healthedge.patient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @Value("${hello.world.message}")
    private String helloMessage;

    @RequestMapping("/")
    public String hello(){
        return "Message is \"" + helloMessage + "\"";
    }
}
