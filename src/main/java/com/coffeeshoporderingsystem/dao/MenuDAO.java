package com.coffeeshoporderingsystem.dao;

import java.util.List;

import com.coffeeshoporderingsystem.entities.Menu;

public interface MenuDAO {
	void addMenu(Menu menu);
	Menu getMenuById(int itemId);
	List<Menu> getAllMenus();
	void updateMenu(Menu menu);
	void deleteMenu(int itemId);
}
