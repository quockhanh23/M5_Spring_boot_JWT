package com.example.demo.services;

import java.util.Optional;

public interface GeneralService<T> {

    Iterable<T> findAll();

    Optional<T> findById(Long id);

    void save(T t);
}
