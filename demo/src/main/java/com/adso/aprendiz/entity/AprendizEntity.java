package com.adso.aprendiz.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor // Constructor con argumentos
@NoArgsConstructor // Constructor sin argumentos
@Entity // Indica que es una entidad en la base de datos
@Table(name = "aprendiz") // Nombre de la tabla en la base de datos
public class AprendizEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String direccion;
}