package com.LAAG.Generador.materias;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "materias")
public class MateriasEntity {
    @Id
    private Long id_materia;
    private String name_materia;
    private int semestre;

    public Long getId_materia() {
        return id_materia;
    }

    public void setId_materia(Long id_materia) {
        this.id_materia = id_materia;
    }

    public String getName_materia() {
        return name_materia;
    }

    public void setName_materia(String name_materia) {
        this.name_materia = name_materia;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}
