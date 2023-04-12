package Entidades;

public class GestorFacturas {
    Calculadora calculadora;
    private String tipo;

    public GestorFacturas(Calculadora calculadora, String tipo) {
        this.calculadora = calculadora;
        this.tipo = tipo;
    }
}
