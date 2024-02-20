package com.java.javacore.dao.hw.template.services;

import com.java.javacore.dao.hw.template.enteties.Order;

import java.util.List;

public interface OrderManagementService {

    void addOrder(Order order);

    List<Order> getOrdersByUserId(int userId);

    List<Order> getOrders();

}