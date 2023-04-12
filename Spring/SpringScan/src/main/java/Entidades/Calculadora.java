package Entidades;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    public Calculadora() {
        System.out.println("Constructor vacio");
    }

    public String holaMundo() {
       return "Hola mundo!";
    }

}
