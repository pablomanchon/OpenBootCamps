package com.example.springBoot.Entidades;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class BookController {
    private BookRepository repository;

    public BookController(BookRepository repository) {
        this.repository = repository;
    }

    @GetMapping("api/books")
    public List<Book> getBooks() {
        return repository.findAll();
    }

    //Obtener libro por ID
    @GetMapping("api/books/{id}")
    public ResponseEntity<Book> findOneById(@PathVariable Long id) {
        Optional<Book> book = repository.findById(id);
//    opcion 1
        if (book.isPresent()) {
            return ResponseEntity.ok(book.get());
        } else {
            return ResponseEntity.notFound().build();

        }
    }

    @PostMapping("api/books")
    public Book create(@RequestBody Book book) {
        return repository.save(book);
    }
}
