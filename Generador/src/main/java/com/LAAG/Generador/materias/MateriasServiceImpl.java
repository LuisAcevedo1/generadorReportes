package com.LAAG.Generador.materias;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriasServiceImpl implements MateriasService {

    private final MateriasRepository repository;

    public MateriasServiceImpl(MateriasRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<MateriasEntity> obtenerTodas() {
        return repository.findAll();
    }
}