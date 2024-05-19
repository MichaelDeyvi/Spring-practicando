package com.proyecto.springwebapp.Repository;

import java.util.Arrays;
import java.util.List;

import com.proyecto.springwebapp.Models.Product;

public class ProductRepository {


    private List<Product> data;

    public ProductRepository() {
        this.data = Arrays.asList(new Product(1L, "Bicileta", 600L),
                                new Product(2L, "sillon", 1000L),
                                new Product(3L, "Memoria SSD", 500L));
    }
    

    public List <Product> findAll(){
        return data;
    }

    public Product findById(Long id){
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    
}
