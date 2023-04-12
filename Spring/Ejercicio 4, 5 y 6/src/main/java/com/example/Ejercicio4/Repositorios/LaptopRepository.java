package com.example.Ejercicio4.Repositorios;

import com.example.Ejercicio4.Entidades.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop,Long> {
}
