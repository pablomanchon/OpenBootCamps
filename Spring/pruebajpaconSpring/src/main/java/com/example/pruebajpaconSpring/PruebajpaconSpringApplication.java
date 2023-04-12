package com.example.pruebajpaconSpring;

import Repositorios.Repositorio;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PruebajpaconSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(PruebajpaconSpringApplication.class, args);
		Repositorio repositorio = context.getBean(Repositorio.class);
		System.out.println("hola");
	}

}
