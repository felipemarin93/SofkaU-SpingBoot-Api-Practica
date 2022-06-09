package com.crud.democrud.controllers;

import com.crud.democrud.models.RolModel;
import com.crud.democrud.services.RolService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;



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
    public RolModel guardarRol(@RequestBody RolModel rol) {
        return this.rolService.guardarRolUsuario(rol);
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
