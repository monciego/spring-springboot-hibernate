package com.monciego.springboot.demo.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
     // expose "/" that return "Hello World"

     @GetMapping("/")
     public String sayHello() {
        return "Hello World";
     }

}
