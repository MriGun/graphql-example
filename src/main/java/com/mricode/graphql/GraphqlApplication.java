package com.mricode.graphql;

import com.mricode.graphql.entity.Product;
import com.mricode.graphql.repo.ProductRepo;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class GraphqlApplication {

	/*@Autowired
	private ProductRepo repository;

	@PostConstruct
	public void initDB(){
		List<Product> products = Stream.of(
				new Product("Laptop", "Electronics", 74999.99f, 50),
				new Product("Smartphone", "Electronics", 39999.99f, 100),
				new Product("Office Chair", "Furniture", 7999.99f, 200),
				new Product("Notebook", "Stationery", 99.99f, 500),
				new Product("Desk Lamp", "Furniture", 1999.99f, 150),
				new Product("Water Bottle", "Accessories", 499.99f, 300)
		).collect(Collectors.toList());
		repository.saveAll(products);
	}*/

	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
		System.out.println("Graph QL is running....");
	}

}
