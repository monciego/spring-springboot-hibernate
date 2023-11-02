package com.monciego.springboot.demo.myapp.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class FunRestController {
    // expose "/" that return "Hello World"

    @GetMapping(value="/")
    public String sayHello() {
        return "Hello World";
    }
    
}
