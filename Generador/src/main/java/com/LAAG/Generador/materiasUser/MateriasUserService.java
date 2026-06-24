package com.LAAG.Generador.materiasUser;

import com.LAAG.Generador.dto.MateriasUserDTO;

import java.util.List;

public interface MateriasUserService {

    List<MateriasUserDTO> obtenerPorIdYtipo(Integer idUser, Integer tipoMateria);
    List<MateriasUserDTO> obtenerPorId(Integer idUser);
}
