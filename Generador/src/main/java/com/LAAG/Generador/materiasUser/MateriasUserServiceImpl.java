package com.LAAG.Generador.materiasUser;

import com.LAAG.Generador.dto.MateriasUserDTO;
import com.LAAG.Generador.materias.MateriasEntity;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.PersistenceContext;
import jakarta.persistence.EntityManager;

import java.util.ArrayList;
import java.util.List;

@Service
public class MateriasUserServiceImpl implements MateriasUserService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<MateriasUserDTO> obtenerPorIdYtipo(Integer idUser, Integer tipoMateria) {
        String sql = "SELECT new com.LAAG.Generador.dto.MateriasUserDTO(" +
                "mu.id_materia_user, mu.id_materia, mu.tipo_materia_user, m.name_materia) " +
                "FROM MateriasUserEntity mu " +
                "JOIN MateriasEntity m ON m.id_materia = mu.id_materia " +
                "WHERE mu.id_user = :idUser " +
                "AND mu.tipo_materia_user = :tipoMateria " +
                "ORDER BY mu.id_materia";

        Query query = entityManager.createQuery(sql);
        query.setParameter("idUser", idUser);
        query.setParameter("tipoMateria", tipoMateria);

        return query.getResultList();
    }

    @Override
    public List<MateriasUserDTO> obtenerPorId(Integer idUser) {
        String sql = "SELECT new com.LAAG.Generador.dto.MateriasUserDTO(" +
                "mu.id_materia_user, mu.id_materia, mu.tipo_materia_user, m.name_materia) " +
                "FROM MateriasUserEntity mu " +
                "JOIN MateriasEntity m ON m.id_materia = mu.id_materia " +
                "WHERE mu.id_user = :idUser " +
                "ORDER BY mu.id_materia";

        Query query = entityManager.createQuery(sql);
        query.setParameter("idUser", idUser);

        return query.getResultList();
    }
}
