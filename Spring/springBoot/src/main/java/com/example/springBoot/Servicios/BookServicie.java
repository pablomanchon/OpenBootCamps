package com.example.springBoot.Servicios;

import com.example.springBoot.Entidades.Book;
import com.example.springBoot.Entidades.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class BookServicie {
    @Autowired
    BookRepository bookRepo;
    public void crearLibro(String title, String author, Integer pages, Double price, LocalDate releaseDate, Boolean online) {
        Book libro = new Book();
        libro.setTitle(title);
        libro.setAuthor(author);
        libro.setPages(pages);
        libro.setReleaseDate(releaseDate);
        libro.setOnline(online);
        libro.setPrice(price);
        bookRepo.save(libro);
    }
}
