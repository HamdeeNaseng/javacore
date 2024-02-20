package com.java.javacore.dao.hw.template.enteties;

import java.io.Serializable;

public interface Product extends Serializable {

    int getId();

    String getProductName();

    String getCategoryName();

    double getPrice();

    void setPrice(double price);
}