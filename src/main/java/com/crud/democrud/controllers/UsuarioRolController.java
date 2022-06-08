package com.crud.democrud.controllers;

import com.crud.democrud.models.UsuarioRolModel;
import com.crud.democrud.services.UsuarioRolService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;


@CrossOrigin
@RestController
@RequestMapping("/usuariorol")
public class UsuarioRolController {

    UsuarioRolService usuarioRolService;

    @GetMapping()
    public ArrayList<UsuarioRolModel> obtenerUsuarios() {
        return usuarioRolService.obtenerRolUsuarios();
    }

    @PostMapping()
    public UsuarioRolModel guardarUsuario(@RequestBody UsuarioRolModel usuarioRol) {
        return this.usuarioRolService.guardarRolUsuario(usuarioRol);
    }

    @PutMapping(path = "/{id}")
    public UsuarioRolModel actualizarUsuario(@RequestBody UsuarioRolModel usuarioRol, @PathVariable("id") Long idRol) {
        usuarioRol.setIdRol(idRol);
        return this.usuarioRolService.guardarRolUsuario(usuarioRol);
    }

    @GetMapping(path = "/{id}")
    public Optional<UsuarioRolModel> obtenerUsuarioPorId(@PathVariable("id") Long id) {
        return this.usuarioRolService.obtenerRolPorId(id);
    }


    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.usuarioRolService.eliminarRolUsuario(id);
        if (ok) {
            return "Se eliminó el usuario con id " + id;
        } else {
            return "No pudo eliminar el usuario con id" + id;
        }
    }


}
