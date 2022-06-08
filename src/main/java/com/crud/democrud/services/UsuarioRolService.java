package com.crud.democrud.services;


import com.crud.democrud.models.UsuarioRolModel;
import com.crud.democrud.repositories.UsuarioRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.Optional;


public class UsuarioRolService {

    @Autowired
    UsuarioRolRepository usuarioRolRepository;

    public ArrayList<UsuarioRolModel> obtenerRolUsuarios(){
        return (ArrayList<UsuarioRolModel>) usuarioRolRepository.findAll();
    }

    public UsuarioRolModel guardarRolUsuario(UsuarioRolModel usuarioRol){

        return usuarioRolRepository.save(usuarioRol);
    }

    public Optional<UsuarioRolModel> obtenerRolPorId(Long id){

        return usuarioRolRepository.findById(id);
    }



    public boolean eliminarRolUsuario(Long id) {
        try{
            usuarioRolRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
