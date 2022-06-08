package com.crud.democrud.models;


import javax.persistence.*;

@Entity
@Table(name = "usuariorol")
public class UsuarioRolModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idRol;
    private Long idUsuario;
    private String rol;

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public UsuarioRolModel(Long idRol, Long idUsuario, String rol) {
        this.idRol = idRol;
        this.idUsuario = idUsuario;
        this.rol = rol;
    }

    public UsuarioRolModel() {
    }
}
