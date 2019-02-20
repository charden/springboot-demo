package com.example.demo.entity;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@ConfigAutowireable
@Dao
public interface DemoDao {

    @Select
    List<DemoEntity> selectAll();

}