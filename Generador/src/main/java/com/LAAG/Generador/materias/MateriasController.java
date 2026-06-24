package com.LAAG.Generador.materias;

import com.LAAG.Generador.materias.MateriasEntity;
import com.LAAG.Generador.materias.MateriasService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/materias")
public class MateriasController {

    private final MateriasService service;

    public MateriasController(MateriasService service) {
        this.service = service;
    }

    @GetMapping("/obtenerAll")
    public List<MateriasEntity> listar() {
        return service.obtenerTodas();
    }


}
