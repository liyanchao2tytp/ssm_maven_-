package com.dzxy.service;

import com.dzxy.model.Product;

import java.util.List;

public interface IProductService {
    public List<Product> findAll() throws Exception;
}
