package com.mricode.graphql.service;

import com.mricode.graphql.entity.Product;
import com.mricode.graphql.repo.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepo productRepo;


    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> getProducts(){
        return productRepo.findAll();
    }

    public List<Product> getProductsByCategory(String category){
        return productRepo.findByCategory(category);
    }
}
