package com.aluracursos.literalura.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibro (
        @JsonAlias("title") String titulo,
        @JsonAlias("authors")List<DatosAutor> autores,
        @JsonAlias("languages")List<String> idioma,
        @JsonAlias("download_count")Integer numeroDescargas
){
}