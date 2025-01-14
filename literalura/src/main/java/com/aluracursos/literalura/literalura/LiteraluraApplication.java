package com.aluracursos.literalura.literalura;
import com.aluracursos.literalura.literalura.principal.Principal;
import com.aluracursos.literalura.literalura.repository.LibroRepository;
import com.aluracursos.literalura.literalura.service.AutorService;
import com.aluracursos.literalura.literalura.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.alura.literalura.repository")
public class LiteraluraApplication implements CommandLineRunner {
    @Autowired
    private LibroService libroService;

    @Autowired
    private AutorService autorService;

    public static void main(String[] args) {
        SpringApplication.run(LiteraluraApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Se inicializa la clase Principal con los repositorios necesarios
        Principal principal = new Principal(libroService, autorService);
        principal.muestraElMenu();
    }
}