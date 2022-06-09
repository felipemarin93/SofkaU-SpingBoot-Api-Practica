package com.crud.democrud.services;


import com.crud.democrud.models.RolModel;
import com.crud.democrud.repositories.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class RolService {

    @Autowired
    RolRepository rolRepository;

    public ArrayList<RolModel> obtenerRolUsuarios(){
        return (ArrayList<RolModel>) rolRepository.findAll();
    }

    public RolModel guardarRolUsuario(RolModel rol){
        return rolRepository.save(rol);
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
