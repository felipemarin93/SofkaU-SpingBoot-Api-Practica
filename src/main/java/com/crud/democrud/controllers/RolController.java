package com.crud.democrud.controllers;

import com.crud.democrud.models.RolModel;
import com.crud.democrud.services.RolService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.Optional;


@CrossOrigin
@RestController
@RequestMapping("/roles")
public class RolController {

    @Autowired
    RolService rolService;


    @GetMapping()
    public ArrayList<RolModel> obtenerRolUsuarios() {
        return rolService.obtenerRolUsuarios();
    }


    @PostMapping()
    public RolModel guardarRolUsuario(@RequestBody RolModel usuarioRol) {
        return this.rolService.guardarRolUsuario(usuarioRol);
    }


    @PutMapping(path = "/{id}")
    public RolModel actualizarRolUsuario(@RequestBody RolModel usuarioRol, @PathVariable("id") Long idRol) {
        usuarioRol.setIdRol(idRol);
        return this.rolService.guardarRolUsuario(usuarioRol);
    }

    @GetMapping(path = "/{id}")
    public Optional<RolModel> obtenerRolUsuarioPorId(@PathVariable("id") Long id) {
        return this.rolService.obtenerRolPorId(id);
    }


    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.rolService.eliminarRolUsuario(id);
        if (ok) {
            return "Se eliminó el usuario con id " + id;
        } else {
            return "No pudo eliminar el usuario con id" + id;
        }
    }


}
