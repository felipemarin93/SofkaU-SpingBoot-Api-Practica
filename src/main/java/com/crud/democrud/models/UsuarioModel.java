package com.crud.democrud.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;


import javax.persistence.*;
import java.util.ArrayList;

import java.util.List;


@Data
@Entity
@Table(name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String nombre;
    private String email;
    private Integer prioridad;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "idUsuario")
    @JsonManagedReference
    private List<RolModel> rol = new ArrayList<>();




    public UsuarioModel(String nombre, String email, Integer prioridad) {
        this.nombre = nombre;
        this.email = email;
        this.prioridad = prioridad;
    }

    public UsuarioModel() {

    }

    public void setEmail(String email) {
        this.email = email;
    }

}