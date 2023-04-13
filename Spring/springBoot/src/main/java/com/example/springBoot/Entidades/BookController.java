package com.example.springBoot.Entidades;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class BookController {
    private BookRepository repository;
    Logger log = LoggerFactory.getLogger(BookController.class);

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
    public ResponseEntity<Book> create(@RequestBody Book book) {
        if (book.getId() != null) {
            log.warn("Book already exists");
            ResponseEntity.badRequest().build();
        }
        Book result = repository.save(book);
        return ResponseEntity.ok(result);
    }

    @PutMapping("api/books")
    public ResponseEntity<Book> update(@RequestBody Book book) {
        if(!repository.existsById(book.getId())) {
            log.warn("Book doesnt exist");
            ResponseEntity.notFound().build();
        }
        repository.save(book);
        return ResponseEntity.ok(book);
    }

    @DeleteMapping("api/books/{id}")
    public ResponseEntity<Book> delete(@PathVariable Long id){
        if(!repository.existsById(id)){
            log.warn("Book doesnt exist");
            ResponseEntity.notFound().build();
        }
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("api/books")
    public ResponseEntity<Book> deleteAll(){
        log.info("REST Request for delete all books");
        repository.deleteAll();
        return ResponseEntity.noContent().build();
    }
}
