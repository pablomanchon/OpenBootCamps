package Entidades;

import org.springframework.stereotype.Component;

@Component
public class GestorFacturas {
    Calculadora calculadora;
    private String tipo;

    public GestorFacturas(Calculadora calculadora) {
        System.out.println("constructor");
        this.calculadora = calculadora;
    }


}
