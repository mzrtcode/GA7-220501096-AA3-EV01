package com.example.ga7220501096aa3ev01.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(schema = "vendores")
public class Vendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // Identificador único del vendedor

    private String nombres; // Nombres del vendedor

    private String apellidos; // Apellidos del vendedor

    private String tipo_identificacion; // Tipo de identificación del vendedor (por ejemplo, cédula, pasaporte)

    private String numero_identificacion; // Número de identificación del vendedor

    private String correo; // Correo electrónico del vendedor

    private String celular; // Número de celular del vendedor

    private Date fecha_nacimiento; // Fecha de nacimiento del vendedor

    private String direccion; // Dirección del vendedor

    private String clave; // Clave o contraseña del vendedor
}
