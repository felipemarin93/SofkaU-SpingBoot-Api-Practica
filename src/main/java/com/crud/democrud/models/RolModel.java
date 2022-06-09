package com.crud.democrud.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "roles")
public class RolModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idRol;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "rol_usuario_id", nullable = false)
    @JsonBackReference
    private UsuarioModel idUsuario;

    private String rol;


    public RolModel(Long idRol, String rol) {
        this.idRol = idRol;
        this.rol = rol;
    }

    public RolModel() {
    }
}
