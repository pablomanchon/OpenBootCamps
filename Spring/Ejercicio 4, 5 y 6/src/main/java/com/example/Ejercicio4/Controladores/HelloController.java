package com.example.Ejercicio4.Controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Ejercicio 4
@RestController
public class HelloController {
    @GetMapping("/helloWorld")
    public String helloWorld() {
        return "Hola mundo Cruel";
    }
}
