package br.com.cubosacademy.apirestjava.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TesteController {
    
    @GetMapping
    public String teste() {
        return  "tudo OK meu primeiro Endpoint foi criado.";
    }

}
