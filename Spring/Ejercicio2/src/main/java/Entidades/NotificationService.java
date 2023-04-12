package Entidades;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public NotificationService() {
        System.out.println("Constructor vacio");
    }

    public void imprimirSaludo() {
        System.out.println("Hola mundo!");
    }
}
