package br.com.estudos.gitops.hellojava.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloController {
    
    @GetMapping("/api/hello")
    public String getMethodName(@RequestParam String name) {
        var str = name == null ? "Olá" : "Hello, "+name;
        return str;
    }
    
}
