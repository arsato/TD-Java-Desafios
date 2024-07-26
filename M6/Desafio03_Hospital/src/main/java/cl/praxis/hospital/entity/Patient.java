package cl.praxis.hospital.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pacientes")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="nombre",length = 50,nullable = false)
    private String name;

    @Column(name="apellido",length = 50)
    private String lastName;

    @Column(name="rut",length = 9,nullable = false)
    private int rut;

    @Column(name="fecha_nacimiento",length = 50,nullable = false)
    private LocalDate birthDate;

    @Column(name="sexo",length = 10,nullable = false)
    private String gender;

    @Column(name="email",length = 50)
    private String email;

    @Column(name="telefono",length = 20,nullable = false)
    private String phone;

    @Column(name="fecha_hospitalizacion",length = 256,nullable = false)
    private LocalDate hospitalizationDate;
}
