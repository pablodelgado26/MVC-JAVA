package br.com.xavecoding.regescweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class helloController {
    
    @GetMapping("/hello")
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView("hello"); // Retorna o nome da view "hello.html"
        mv.addObject ("nome", "Augusto dos Anjos"); 
        return mv; 
    }

    @GetMapping("/hello-model")
    public String hello(Model model) {
        model.addAttribute("nome", "Euclides da Cunha"); 
        return "hello"; // Retorna o nome da view "hello.html"
    }

    @GetMapping("/hello-servlet")
    public String hello(HttpServletRequest request) {
        request.setAttribute("nome", "Vargas"); 
        return "hello"; // Retorna o nome da view "hello.html"
    }
    
}
