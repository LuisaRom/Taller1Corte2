package com.example.ProyectoArquitectura.Controller;

import com.example.ProyectoArquitectura.Model.Grupo;
import com.example.ProyectoArquitectura.Service.GrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grupos")
public class GrupoController {

    @Autowired
    private GrupoService grupoService;

    @GetMapping
    public List<Grupo> getAllGrupos() {
        return grupoService.getAllGrupos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Grupo> getGrupoById(@PathVariable Long id) {
        Grupo grupo = grupoService.getGrupoById(id);
        return grupo != null ? ResponseEntity.ok(grupo) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Grupo createGrupo(@RequestBody Grupo grupo) {
        return grupoService.saveGrupo(grupo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGrupo(@PathVariable Long id) {
        grupoService.deleteGrupo(id);
        return ResponseEntity.noContent().build();
    }
}
