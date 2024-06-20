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

    //sales team update the stock of a product
    public Product updateStock(int id, int stock) {

        Product product = productRepo.findById(id)
                                .orElseThrow(() -> new RuntimeException("Product not found with ID " + id));


        product.setStock(stock);

        return productRepo.save(product);
    }

    //warehouse : recieve new shipment
    public Product recieveNewShipment(int id, int quantity) {

        Product product = productRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with ID " + id));


        product.setStock(product.getStock() + quantity);

        return productRepo.save(product);
    }
}
