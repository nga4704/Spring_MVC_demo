package springmvc.starter.demo.service;

import java.util.List;
import java.util.Optional;

public interface CRUD<T, ID> {

    List<T> findAll();

    Optional<T> findById(ID id);

    T save(T entity);

    T update(T entity);

    void deleteById(ID id);
}