package com.robert.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello1")
public class HelloResource {

    @GetMapping
    public String hello(){
        return "Greetings";
    }
}
