package com.dzxy.dao;

import com.dzxy.model.Product;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IProductDao {
    @Select("select * from product ")
    public List<Product> findAll() throws Exception;
}
