package com.company.project.facade;



public class VegRestaurant implements Hotel {

	public Menus getMenus()
	{
		VegMenu v = new VegMenu();
		return (Menus) v;
	}
}
