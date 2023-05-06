package com.example.springBoot.Entidades;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository <Book, Long> {

    @Query ("SELECT l FROM book l WHERE l.title = :nombre")
    public String buscarPorNombre(@Param("title") String nombre);
}
