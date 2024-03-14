package com.coffeeshoporderingsystem.dao;

import java.util.List;

import com.coffeeshoporderingsystem.entities.Order;

public interface OrderDAO {
	Order getOrderById(int orderId);
	void addOrder(Order order);
	void updateOrder(Order order);
	void deleteOrder(int orderId);
	List<Order> getAllOrders();
}
