package com.LAAG.Generador.dto;

public class MateriasUserDTO {
    private Long id_materia_user;
    private Integer id_materia;
    private Integer tipo_materia_user;
    private String name_materia;

    public Long getId_materia_user() {
        return id_materia_user;
    }

    public void setId_materia_user(Long id_materia_user) {
        this.id_materia_user = id_materia_user;
    }

    public Integer getId_materia() {
        return id_materia;
    }

    public void setId_materia(Integer id_materia) {
        this.id_materia = id_materia;
    }

    public Integer getTipo_materia_user() {
        return tipo_materia_user;
    }

    public void setTipo_materia_user(Integer tipo_materia_user) {
        this.tipo_materia_user = tipo_materia_user;
    }

    public String getName_materia() {
        return name_materia;
    }

    public void setName_materia(String name_materia) {
        this.name_materia = name_materia;
    }

    public MateriasUserDTO(Long id_materia_user, Integer id_materia, Integer tipo_materia_user, String name_materia) {
        this.id_materia_user = id_materia_user;
        this.id_materia = id_materia;
        this.tipo_materia_user = tipo_materia_user;
        this.name_materia = name_materia;
    }
}
