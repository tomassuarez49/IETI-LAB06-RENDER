package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class greetingController{

    @GetMapping("/name")
    public static String greeting(){
        return "HOLA TOMAS";
    }


}