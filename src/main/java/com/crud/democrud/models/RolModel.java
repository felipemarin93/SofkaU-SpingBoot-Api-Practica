package com.crud.democrud.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "rol")
public class RolModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String rolName;
    @ManyToOne()
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    @Getter
    @Setter
    private UsuarioModel idusuario;

    public RolModel(Long id, String rolName, UsuarioModel idUsuario) {
        this.id = id;
        this.rolName = rolName;
        this.idusuario = idUsuario;
    }

    public RolModel() {
    }
}
