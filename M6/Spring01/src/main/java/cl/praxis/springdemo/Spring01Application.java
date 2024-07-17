package cl.praxis.springdemo;

import cl.praxis.springdemo.model.Persona;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring01Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring01Application.class, args);
		Persona persona = new Persona();
		persona.setNombre("Ariel");
		persona.setApellido("Sandoval");
		persona.setEdad(35);

		System.out.println("Nombre: " + persona.getNombre());
		System.out.println("Apellido: " + persona.getApellido());
		System.out.println("Edad: " + persona.getEdad());
	}

}
