package com.example.ProyectoArquitectura.Controller;

import com.example.ProyectoArquitectura.Model.Contrato;
import com.example.ProyectoArquitectura.Service.ContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contratos")
public class ContratoController {

    @Autowired
    private ContratoService contratoService;

    @GetMapping
    public List<Contrato> getAllContratos() {
        return contratoService.getAllContratos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contrato> getContratoById(@PathVariable Long id) {
        Contrato contrato = contratoService.getContratoById(id);
        return contrato != null ? ResponseEntity.ok(contrato) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Contrato createContrato(@RequestBody Contrato contrato) {
        return contratoService.saveContrato(contrato);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContrato(@PathVariable Long id) {
        contratoService.deleteContrato(id);
        return ResponseEntity.noContent().build();
    }
}
