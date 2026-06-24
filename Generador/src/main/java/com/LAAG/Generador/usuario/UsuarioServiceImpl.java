package com.LAAG.Generador.usuario;

import com.LAAG.Generador.dto.UsuarioRequestDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioServiceImpl(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<UsuarioRequestDTO> obtenerTodos() {
        return repository.findAll()
                .stream()
                .map(this::convertirADTO)
                .collect(Collectors.toList());
    }

    @Override
    public UsuarioRequestDTO obtenerPorId(Long id) {
        return repository.findById(id)
                .map(this::convertirADTO)
                .orElse(null);
    }

    @Override
    public UsuarioRequestDTO crear(UsuarioRequestDTO dto) {
        UsuarioEntity entity = new UsuarioEntity();
        entity.setId_user(dto.getId_user());
        entity.setUser_name(dto.getUser_name());
        entity.setUser_semestre(dto.getUser_semestre());
        entity.setUser_carrera(dto.getUser_carrera());
        entity.setUser_priv(dto.getUser_priv());

        UsuarioEntity guardado = repository.save(entity);
        return convertirADTO(guardado);
    }

    private UsuarioRequestDTO convertirADTO(UsuarioEntity entity) {
        UsuarioRequestDTO dto = new UsuarioRequestDTO();
        dto.setId_user(entity.getId_user());
        dto.setUser_name(entity.getUser_name());
        dto.setUser_semestre(entity.getUser_semestre());
        dto.setUser_carrera(entity.getUser_carrera());
        dto.setUser_priv(entity.getUser_priv());
        return dto;
    }
}