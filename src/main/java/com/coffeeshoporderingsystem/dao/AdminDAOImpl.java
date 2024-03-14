package com.coffeeshoporderingsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.coffeeshoporderingsystem.entities.Admin;

@Transactional
public class AdminDAOImpl implements AdminDAO {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Admin getAdminById(int adminId) {
		return entityManager.find(Admin.class, adminId);
	}

	public void addAdmin1(Admin admin) {
		entityManager.persist(admin);
	}

	public void updateAdmin1(Admin admin) {
		entityManager.merge(admin);
	}

	@Override
	public void deleteAdmin(int adminId) {
		Admin admin = entityManager.find(Admin.class, adminId);
		if (admin != null) {
			entityManager.remove(admin);
		}
	}

	@Override
	public List<Admin> getAllAdmins() {
		return entityManager.createQuery("SELECT a FROM Admin a", Admin.class).getResultList();
	}

	@Override
	public void addAdmin(Admin admin) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAdmin(Admin admin) {
		// TODO Auto-generated method stub

	}
}
