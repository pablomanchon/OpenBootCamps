package com.example.springBoot;

import com.example.springBoot.Entidades.Book;
import com.example.springBoot.Entidades.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		BookRepository repository = context.getBean(BookRepository.class);
		Book book1 = new Book(null,"Alicia en el pais de las maravillas", "Disney",
				200, 20000d, LocalDate.of(1997,10,13),true);
		Book book2 = new Book(null, "Harry Potter", "DreamWorks",250,
				1999d,LocalDate.of(1850,12,1),false);

		//Guardar en la base de datos
		repository.save(book1);
		repository.save(book2);

		//Recuperar los libros
		System.out.println(repository.findAll().size());

	}

}
