package com.tap.dao;

import java.util.List;
import com.tap.model.Order;

public interface OrderDao {
    void addOrder(Order order);
    Order getOrder(int orderId);
    void updateOrder(Order order);
    void deleteOrder(int orderId);
    List<Order> getAllOrders();
    List<Order> getOrdersByUserId(int userId);
    List<Order> getOrdersByRestaurantId(int restaurantId);
}
