package com.anm.estoque.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class EstoqueController {

    @GetMapping("/")
    public void testApi() {
        System.out.println("A Api está funcionando!");
    }
    }
    
    

