package com.dzxy.service.impl;

import com.dzxy.dao.IProductDao;
import com.dzxy.model.Product;
import com.dzxy.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ProductService implements IProductService {
    @Autowired
    private IProductDao productDao;
    public List<Product> findAll() throws Exception {
        return productDao.findAll();
    }
}
