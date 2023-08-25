package com.company.project.facade;

public class VegNonBothRestaurant implements Hotel {

	public Menus getMenus()
	{
		Both b = new Both();
		return (Menus) b;
	}
}

