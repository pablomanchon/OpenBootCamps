package com.example.Ejercicio4;

import com.example.Ejercicio4.Entidades.Laptop;
import com.example.Ejercicio4.Repositorios.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio4Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Ejercicio4Application.class, args);
		//Ejercicio 5
		Laptop laptop1 = new Laptop(null, "Asus", 25000d, 1280,720);
		Laptop laptop2 = new Laptop(null, "Apple", 500000d, 1280, 720);

		LaptopRepository repository = context.getBean(LaptopRepository.class);

		repository.save(laptop1);
		repository.save(laptop2);

	}

}
