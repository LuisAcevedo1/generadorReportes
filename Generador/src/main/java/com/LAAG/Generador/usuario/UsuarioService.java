package com.LAAG.Generador.usuario;

import com.LAAG.Generador.dto.UsuarioRequestDTO;

import java.util.List;

public interface UsuarioService {

    List<UsuarioRequestDTO> obtenerTodos();

    UsuarioRequestDTO obtenerPorId(Long id);

    UsuarioRequestDTO crear(UsuarioRequestDTO dto);
}