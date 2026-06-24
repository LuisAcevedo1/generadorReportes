package com.LAAG.Generador.usuario;

import com.LAAG.Generador.dto.UsuarioRequestDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @GetMapping("/obtenerAll")
    public List<UsuarioRequestDTO> listar() {
        return service.obtenerTodos();
    }

    @GetMapping("/obtener")
    public UsuarioRequestDTO obtenerPorId(@RequestParam Long id){
        return service.obtenerPorId(id);
    }
}