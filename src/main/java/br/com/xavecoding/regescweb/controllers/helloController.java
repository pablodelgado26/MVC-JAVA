package br.com.xavecoding.regescweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class helloController {
    
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    
}
