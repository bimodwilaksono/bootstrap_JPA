package com.enigma.service;

import java.util.List;

public interface IService<T> {
    void insert(T params);

    void delete(String id);

    void update(T params);

    T getById(String id);

    void getAll(Integer page, Integer size);

    void getAllByName(String name);

}
