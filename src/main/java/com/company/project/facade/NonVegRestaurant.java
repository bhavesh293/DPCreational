package com.company.project.facade;

public class NonVegRestaurant implements Hotel {

	public Menus getMenus()
	{
		NonVegMenu nv = new NonVegMenu();
		return (Menus) nv;
	}
}

