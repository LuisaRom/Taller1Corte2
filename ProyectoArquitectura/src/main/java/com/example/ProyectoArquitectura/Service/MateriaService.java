package com.example.ProyectoArquitectura.Service;

import com.example.ProyectoArquitectura.Model.Materia;
import com.example.ProyectoArquitectura.Repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaService {

    @Autowired
    private MateriaRepository materiaRepository;

    public Materia guardarMateria(Materia materia) {
        return materiaRepository.save(materia);
    }

    public List<Materia> listarMaterias() {
        return materiaRepository.findAll();
    }

}
