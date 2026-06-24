package com.LAAG.Generador.dto;

public class UsuarioRequestDTO {
    private Long id_user;
    private String user_name;
    private Integer user_semestre;
    private String user_carrera;
    private String user_priv;


    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Integer getUser_semestre() {
        return user_semestre;
    }

    public void setUser_semestre(Integer user_semestre) {
        this.user_semestre = user_semestre;
    }

    public String getUser_carrera() {
        return user_carrera;
    }

    public void setUser_carrera(String user_carrera) {
        this.user_carrera = user_carrera;
    }

    public String getUser_priv() {
        return user_priv;
    }

    public void setUser_priv(String user_priv) {
        this.user_priv = user_priv;
    }

}
