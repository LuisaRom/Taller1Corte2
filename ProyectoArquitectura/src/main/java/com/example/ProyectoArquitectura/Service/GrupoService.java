package com.example.ProyectoArquitectura.Service;

import com.example.ProyectoArquitectura.Model.Grupo;
import com.example.ProyectoArquitectura.Repository.GrupoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrupoService {
    @Autowired
    private GrupoRepository grupoRepository;

    public List<Grupo> getAllGrupos() {
        return grupoRepository.findAll();
    }

    public Grupo getGrupoById(Long id) {
        return grupoRepository.findById(id).orElse(null);
    }

    public Grupo saveGrupo(Grupo grupo) {
        return grupoRepository.save(grupo);
    }

    public void deleteGrupo(Long id) {
        grupoRepository.deleteById(id);
    }
}
