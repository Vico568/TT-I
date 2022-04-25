package com.example.demo.models;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id; 
    private String denominacionDistintiva;
    private String denominacionGenerica;
    private Double precio;
    private Date fechaCaducidad;
    private String presentacion;
    private String gramaje;
    private Integer existencia;
    
    @ManyToOne
    @JoinColumn(name = "idFarmacia")
    Farmacia farmacia;

    @OneToOne
    @JoinColumn(name = "idRegistroSanitario")
    RegistroSanitario registro;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDenominacionDistintiva() {
        return denominacionDistintiva;
    }

    public void setDenominacionDistintiva(String denominacionDistintiva) {
        this.denominacionDistintiva = denominacionDistintiva;
    }

    public String getDenominacionGenerica() {
        return denominacionGenerica;
    }

    public void setDenominacionGenerica(String denominacionGenerica) {
        this.denominacionGenerica = denominacionGenerica;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getGramaje() {
        return gramaje;
    }

    public void setGramaje(String gramaje) {
        this.gramaje = gramaje;
    }

    public Integer getExistencia() {
        return existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }
}