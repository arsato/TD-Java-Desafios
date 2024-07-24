package cl.praxis.biblioteca;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio02BibliotecaApplication implements CommandLineRunner {

	private final static Logger LOG = LoggerFactory.getLogger(Desafio02BibliotecaApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(Desafio02BibliotecaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("Biblioteca iniciada...");
	}

}
