package com.proyecto.springwebapp.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.springwebapp.Models.Product;
import com.proyecto.springwebapp.Services.RepositoryServices;

@RestController
@RequestMapping("/api")
public class MostrarAPI {

    private RepositoryServices services = new RepositoryServices();

    @GetMapping
    public List<Product> listar(){
        return services.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(Long id){
        return services.findById(id);
    }
    

}


