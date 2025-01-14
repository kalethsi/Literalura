package com.aluracursos.literalura.literalura.service;


import com.aluracursos.literalura.literalura.model.Idiomas;
import com.aluracursos.literalura.literalura.model.Libro;
import com.aluracursos.literalura.literalura.repository.LibroRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepositorio;

    //Buscamos el libro por titulo
    public Optional<Libro> buscarLibroPorTitulo(String titulo) {
        return libroRepositorio.findByTitulo(titulo);
    }

    //Guardamos el libro
    @Transactional
    public Libro guardarLibro(Libro libro) {
        return libroRepositorio.save(libro);
    }

    //Mostramos los libros registrados en la BD
    public List<Libro> listarLibrosRegistrados() {
        return libroRepositorio.findAll();
    }

    //Buscamos el libro por Idioma
    public List<Libro> buscarLibroPorIdiomas(Idiomas nombreIdioma) {
        return libroRepositorio.findByIdiomas(nombreIdioma);
    }

}