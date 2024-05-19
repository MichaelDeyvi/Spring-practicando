package com.proyecto.springwebapp.Services;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;

import com.proyecto.springwebapp.Models.Product;
import com.proyecto.springwebapp.Repository.ProductRepository;

public class RepositoryServices {

    ProductRepository repository = new ProductRepository();


    public List <Product> findAll(){
        return repository.findAll().stream().map(p -> {
            Double ImPrice = p.getPrice()* 1.28d;
            Product newProduct = new Product(p.getId(), p.getName(), ImPrice.longValue());
            return newProduct;
        }).collect(Collectors.toList());
    }


    public Product findById(Long id){
        return repository.findById(id);
    }
}
