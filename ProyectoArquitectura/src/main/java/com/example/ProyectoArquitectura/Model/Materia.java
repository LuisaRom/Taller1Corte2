package com.example.ProyectoArquitectura.Model;

import jakarta.persistence.*;

@Entity
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private int creditos;
    private String modalidad;

    @ManyToOne
    @JoinColumn(name = "profesor_id", nullable = false)
    private Profesor profesor;


    public Materia() {
    }

    public Materia(Long id, String nombre, int creditos, String modalidad, Profesor profesor) {
        this.id = id;
        this.nombre = nombre;
        this.creditos = creditos;
        this.modalidad = modalidad;
        this.profesor = profesor;
    }

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

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", creditos=" + creditos +
                ", modalidad='" + modalidad + '\'' +
                ", profesor=" + profesor +
                '}';
    }
}

