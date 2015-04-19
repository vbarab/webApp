package com.epam.vb.entity.Blog.dao;

import com.epam.vb.entity.Blog.model.BaseEntity;

public interface InterfaceDao<T extends BaseEntity> {

    //INSERT
    T insert(T entity) throws DaoException;

    //FIND
    T findById(Long Id) throws DaoException;

    //UPDATE
    void update(T entity) throws DaoException;

    //DELETE
    boolean delete(T entity) throws DaoException;

    boolean deleteById(Long Id) throws DaoException;


}
