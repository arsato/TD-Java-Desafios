package cl.praxis.hospital.service;

import java.util.List;

public interface ICRUDService<T> {

    T getById(int id);
    List<T> getAll();
    T create(T t);
    T update(T t);
    boolean delete(int id);
}
