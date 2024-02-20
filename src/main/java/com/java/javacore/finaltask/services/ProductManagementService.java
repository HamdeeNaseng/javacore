package com.java.javacore.finaltask.services;

import com.java.javacore.finaltask.enteties.Product;

import java.util.List;

public interface ProductManagementService {
    List<Product> getProducts();

    Product getProductById(int productIdToAddToCart);
}
