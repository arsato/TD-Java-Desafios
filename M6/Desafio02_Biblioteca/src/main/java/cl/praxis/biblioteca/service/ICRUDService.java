package cl.praxis.biblioteca.service;

import java.util.List;

public interface ICRUDService<T> {

    T getById(int id);
    List<T> getAll();
    T create(T entity);
    T update(T entity);
    boolean delete(int id);
}

