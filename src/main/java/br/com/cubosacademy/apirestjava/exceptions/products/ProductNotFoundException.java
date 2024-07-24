package br.com.cubosacademy.apirestjava.exceptions.products;

public class ProductNotFoundException extends RuntimeException{

    public ProductNotFoundException(String message) {
        super(message);
    }

}
