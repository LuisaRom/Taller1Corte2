package com.example.ProyectoArquitectura.Model;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipoContrato;
    private Double salario;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    @OneToOne(mappedBy = "profesor", cascade = CascadeType.ALL)
    private Profesor profesor;

    public Contrato() {
    }

    public Contrato(Long id, String tipoContrato, Double salario, LocalDate fechaInicio, LocalDate fechaFin) {
        this.id = id;
        this.tipoContrato = tipoContrato;
        this.salario = salario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "id=" + id +
                ", tipoContrato='" + tipoContrato + '\'' +
                ", salario=" + salario +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                '}';
    }
}

