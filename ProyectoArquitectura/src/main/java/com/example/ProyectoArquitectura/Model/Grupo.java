package com.example.ProyectoArquitectura.Model;

import jakarta.persistence.*;

@Entity
public class Grupo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Nombre;
    private String Horario;


    @ManyToOne
    @JoinColumn(name = "profesor_id")
    private Profesor profesor;

    public Grupo() {
    }

    public Grupo(Long id, String nombre, String horario, Profesor profesor) {
        this.id = id;
        Nombre = nombre;
        Horario = horario;
        this.profesor = profesor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String horario) {
        Horario = horario;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "id=" + id +
                ", Nombre='" + Nombre + '\'' +
                ", Horario='" + Horario + '\'' +
                ", profesor=" + profesor +
                '}';
    }
}
