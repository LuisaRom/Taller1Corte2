package com.example.ProyectoArquitectura.Service;

import com.example.ProyectoArquitectura.Model.Contrato;
import com.example.ProyectoArquitectura.Repository.ContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContratoService {
    @Autowired
    private ContratoRepository contratoRepository;

    public List<Contrato> getAllContratos() {
        return contratoRepository.findAll();
    }

    public Contrato getContratoById(Long id) {
        return contratoRepository.findById(id).orElse(null);
    }

    public Contrato saveContrato(Contrato contrato) {
        return contratoRepository.save(contrato);
    }

    public void deleteContrato(Long id) {
        contratoRepository.deleteById(id);
    }
}

