package com.epam.vb.entity.Blog.dao;

import com.epam.vb.entity.Blog.model.BaseEntity;

import java.sql.Connection;

public abstract class JdbcBaseDao<T extends BaseEntity> implements InterfaceDao<T>{

    private Connection connection;

    protected JdbcBaseDao(){}

    public Connection getConnection(){
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

}
