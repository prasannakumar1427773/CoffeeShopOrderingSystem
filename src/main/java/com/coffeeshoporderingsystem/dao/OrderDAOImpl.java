package com.coffeeshoporderingsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.coffeeshoporderingsystem.entities.Order;

@Transactional
public class OrderDAOImpl implements OrderDAO {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Order getOrderById(int orderId) {
		return entityManager.find(Order.class, orderId);
	}
	public void addOrder1(Order order) {
		entityManager.persist(order);
	}

	public void updateOrder1(Order order) {
		entityManager.merge(order);
	}

	@Override
	public void deleteOrder(int orderId) {
		Order order = entityManager.find(Order.class, orderId);
		if (order != null) {
			entityManager.remove(order);
		}
	}

	@Override
	public List<Order> getAllOrders() {
		return entityManager.createQuery("SELECT o FROM Order o", Order.class).getResultList();
	}

	@Override
	public void addOrder(Order order) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateOrder(Order order) {
		// TODO Auto-generated method stub

	}
}
