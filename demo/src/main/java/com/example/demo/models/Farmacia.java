package com.example.demo.models;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "Farmacia")
public class Farmacia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "calle")
    private String calle;
    
    @Column(name = "numero")
    private Integer numero;
    
    @Column(name = "colonia")
    private String colonia;
    
    @Column(name = "alcaldia")
    private String alcaldia;
    
    @Column(name = "codigoPostal")
    private Integer codigoPostal;
    
    @Column(name = "ubicacion")
    private String ubicacion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAlcaldia() {
        return alcaldia;
    }

    public void setAlcaldia(String alcaldia) {
        this.alcaldia = alcaldia;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}