package com.LAAG.Generador.materiasUser;

import com.LAAG.Generador.dto.MateriasUserDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/materiasUser")
public class MateriasUserController {

    private final MateriasUserService service;

    public MateriasUserController(MateriasUserService service) {
        this.service = service;
    }

    @GetMapping("/obtenerTipo")
    public List<MateriasUserDTO> obtenerPorIdYTipo(
            @RequestParam Integer id_user,
            @RequestParam Integer tipo) {
        return service.obtenerPorIdYtipo(id_user, tipo);
    }

    @GetMapping("/obtener")
    public List<MateriasUserDTO> obtenerPorId(
            @RequestParam Integer id_user) {
        return service.obtenerPorId(id_user);
    }

}
