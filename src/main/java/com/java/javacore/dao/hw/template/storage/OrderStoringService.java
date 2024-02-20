package com.java.javacore.dao.hw.template.storage;

import com.java.javacore.dao.hw.template.enteties.Order;

import java.util.List;

public interface OrderStoringService {

    void saveOrders(List<Order> order);

    List<Order> loadOrders();
}