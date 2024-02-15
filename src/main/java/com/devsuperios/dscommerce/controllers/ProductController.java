package com.devsuperios.dscommerce.controllers;

import com.devsuperios.dscommerce.dto.ProductDTO;
import com.devsuperios.dscommerce.entities.Product;
import com.devsuperios.dscommerce.repositories.ProductRepository;
import com.devsuperios.dscommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping(value = "/{id}")
    public ProductDTO findByid(@PathVariable Long id){
        return service.findById(id);
    }


}
