package com.java.javacore.dao.hw.template.services;

import com.java.javacore.dao.hw.template.enteties.Product;

import java.util.List;

public interface ProductManagementService {

    List<Product> getProducts();

    Product getProductById(int productIdToAddToCart);

}