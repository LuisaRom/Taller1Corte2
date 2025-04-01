package com.example.ProyectoArquitectura.Controller;

import com.example.ProyectoArquitectura.Model.Materia;
import com.example.ProyectoArquitectura.Model.Profesor;
import com.example.ProyectoArquitectura.Repository.MateriaRepository;
import com.example.ProyectoArquitectura.Repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/materias")
public class MateriaController {

    @Autowired
    private MateriaRepository materiaRepository;

    @Autowired
    private ProfesorRepository profesorRepository;

    @PostMapping("/guardar")
    public Materia guardarMateria(@RequestBody Materia materia) {
        return materiaRepository.save(materia);
    }

    @PostMapping("/profesor/{profesorId}/agregar")
    public Materia agregarMateria(@PathVariable Long profesorId, @RequestBody Materia materia) {
        Profesor profesor = profesorRepository.findById(profesorId)
                .orElseThrow(() -> new RuntimeException("Profesor no encontrado"));
        materia.setProfesor(profesor);
        return materiaRepository.save(materia);
    }

    @GetMapping("/listar")
    public List<Materia> listarMaterias() {
        return materiaRepository.findAll();
    }
}

