package com.example.ProyectoArquitectura.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String apellido;
    private String profesion;
    private String correo;


    @OneToMany(mappedBy = "profesor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Materia> materias;

    @OneToMany(mappedBy = "profesor",cascade = CascadeType.ALL)
    private List<Grupo> grupos;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "contrato_id", referencedColumnName = "id")
    private Contrato contrato;


    public Profesor() {
    }

    public Profesor(long id, String nombre, String apellido, String profesion, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.correo = correo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", profesion='" + profesion + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}

