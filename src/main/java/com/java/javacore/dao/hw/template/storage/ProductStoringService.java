package com.java.javacore.dao.hw.template.storage;

import com.java.javacore.dao.hw.template.enteties.Product;

import java.util.List;

public interface ProductStoringService {
    List<Product> loadProducts();
}
