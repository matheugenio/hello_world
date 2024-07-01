package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello world!!!";
    }

    @GetMapping("/bsmgen")
    public List<String> bsmGen(){
        return Arrays.asList("Persistência","Mentalidade de Crescimento","Orientação ao futuro","Responsabilidade Pessoal");
    }
    @GetMapping("/objetivos")
    public List<String> objetivos(){
        return Arrays.asList("Aprender Spring","Reforçar banco de dados","Trabalhar no Projeto Integrador");
    }

}
