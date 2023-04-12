package com.example.Ejercicio4.Controladores;

import com.example.Ejercicio4.Entidades.Laptop;
import com.example.Ejercicio4.Repositorios.LaptopRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {
    private LaptopRepository repository;

    public LaptopController(LaptopRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/laptops")
    public List<Laptop> findAll() {
        return repository.findAll();
    }

    @GetMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> findOneById(@PathVariable Long id) {
        Optional<Laptop> laptop = repository.findById(id);
        if (laptop.isPresent()) return ResponseEntity.ok(laptop.get());
        else return ResponseEntity.notFound().build();
    }

    //Ejercicio 6
    @PostMapping("/api/laptops")
    public Laptop create(@RequestBody Laptop laptop) {
        return repository.save(laptop);
    }
}
