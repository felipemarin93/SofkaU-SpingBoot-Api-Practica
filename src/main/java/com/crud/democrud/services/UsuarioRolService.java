package com.crud.democrud.services;

import com.crud.democrud.models.UsuarioRolModel;
import com.crud.democrud.repositories.UsuarioRolRepository;

import java.util.Optional;

public class UsuarioRolService implements UsuarioRolRepository {
    @Override
    public <S extends UsuarioRolModel> S save(S entity) {
        return null;
    }

    @Override
    public <S extends UsuarioRolModel> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<UsuarioRolModel> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<UsuarioRolModel> findAll() {
        return null;
    }

    @Override
    public Iterable<UsuarioRolModel> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(UsuarioRolModel entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends UsuarioRolModel> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
