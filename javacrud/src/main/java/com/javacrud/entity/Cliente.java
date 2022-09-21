package com.javacrud.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Cliente {

    @Id
    private int clienteId;
    private String nombreUsuario;
    private String contrasenia;
    private String nombre;
    private String apellidos;
    private String correoElectronico;
    private int edad;
    private float estatura;
    private float peso;
    private float imc;
    private float geb;
    private float eta;
    private Date fechaCreacion;
    private Date fechaActualizacion;

   
   
  


  
}
