package com.example.demo.models;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "RegistroSanitario")
public class RegistroSanitario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    
    @Column(name = "registroSanitario")
    private String registroSanitario;
    
    @Column(name = "titular")
    private String titular;
    
    @Column(name = "denominacionDistintiva")
    private String denominacionDistintiva;
    
    @Column(name = "denominacionGenerica")
    private String denominacionGenerica;
    
    @Column(name = "clasificacionLGS")
    private String clasificacionLGS;
    
    @Column(name = "formaFarmaceutica")
    private String formaFarmaceutica;
    
    @Column(name = "tipoMedicamento")
    private String tipoMedicamento;
    
    @Column(name = "vigencia")
    @Temporal(TemporalType.DATE)
    private Date vigencia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegistroSanitario() {
        return registroSanitario;
    }

    public void setRegistroSanitario(String registroSanitario) {
        this.registroSanitario = registroSanitario;
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

    public String getClasificacionLGS() {
        return clasificacionLGS;
    }

    public void setClasificacionLGS(String clasificacionLGS) {
        this.clasificacionLGS = clasificacionLGS;
    }

    public String getFormaFarmaceutica() {
        return formaFarmaceutica;
    }

    public void setFormaFarmaceutica(String formaFarmaceutica) {
        this.formaFarmaceutica = formaFarmaceutica;
    }

    public String getTipoMedicamento() {
        return tipoMedicamento;
    }

    public void setTipoMedicamento(String tipoMedicamento) {
        this.tipoMedicamento = tipoMedicamento;
    }

    public Date getVigencia() {
        return vigencia;
    }

    public void setVigencia(Date vigencia) {
        this.vigencia = vigencia;
    }
    
}