package com.crud.democrud.services;


import com.crud.democrud.models.RolModel;
import com.crud.democrud.repositories.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class RolService {

    @Autowired
    RolRepository rolRepository;

    public ArrayList<RolModel> obtenerRolUsuarios(){
        return (ArrayList<RolModel>) rolRepository.findAll();
    }

    public RolModel guardarRolUsuario(RolModel usuarioRol){

        return rolRepository.save(usuarioRol);
    }

    public Optional<RolModel> obtenerRolPorId(Long id){

        return rolRepository.findById(id);
    }



    public boolean eliminarRolUsuario(Long id) {
        try{
            rolRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
