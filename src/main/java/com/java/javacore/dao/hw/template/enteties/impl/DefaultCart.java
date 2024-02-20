package com.java.javacore.dao.hw.template.enteties.impl;

import com.java.javacore.dao.hw.template.enteties.Cart;
import com.java.javacore.dao.hw.template.enteties.Product;

import java.util.ArrayList;
import java.util.List;

public class DefaultCart implements Cart {

    private List<Product> products;

    {
        products = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return products.isEmpty();
    }

    @Override
    public void addProduct(Product product) {
        if (product == null) {
            return;
        }
        products.add(product);
    }

    @Override
    public List<Product> getProducts() {
//		return Collections.unmodifiableList(this.products); // returns unmodifiable List
        return this.products;
    }

    @Override
    public void clear() {
        products.clear();
    }

}