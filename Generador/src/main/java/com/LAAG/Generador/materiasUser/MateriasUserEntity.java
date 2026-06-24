package com.LAAG.Generador.materiasUser;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "materias_user")
public class MateriasUserEntity {
    @Id
    private Long id_materia_user;
    private Integer tipo_materia_user;
    private Integer id_user;
    private Integer id_materia;

    public Long getId_materia_user() {
        return id_materia_user;
    }

    public void setId_materia_user(Long id_materia_user) {
        this.id_materia_user = id_materia_user;
    }

    public Integer getTipo_materia_user() {
        return tipo_materia_user;
    }

    public void setTipo_materia_user(Integer tipo_materia_user) {
        this.tipo_materia_user = tipo_materia_user;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public Integer getId_materia() {
        return id_materia;
    }

    public void setId_materia(Integer id_materia) {
        this.id_materia = id_materia;
    }
}
