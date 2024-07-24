package br.com.cubosacademy.apirestjava.controllers;

import java.util.List;

import br.com.cubosacademy.apirestjava.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cubosacademy.apirestjava.models.Product;


@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductRepository ProductRepository;

    //Exibir uma coleção de produtos;
    @GetMapping("/products")
    public ResponseEntity<List<Product>> findAll() {
        List<Product> products = ProductRepository.findAll();
        if (products.isEmpty()) {
            return 
        }
        return ResponseEntity.ok().body(products);
    }

    //Consultar um produto;
    
    //cadastrar um produto;
    
    //eidtar um produto;


}
