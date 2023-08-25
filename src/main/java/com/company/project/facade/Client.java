package com.company.project.facade;


public class Client
{
	public static void main (String[] args)
	{
		HotelKeeper keeper = new HotelKeeperImplementation();
		
		VegMenu v = keeper.getVegMenu();
		System.out.println(v.getMenuItems());
		NonVegMenu nv = keeper.getNonVegMenu();
		System.out.println(nv.getMenuItems());
		Both both = keeper.getVegNonMenu();
		System.out.println(both.getMenuItems());

	}
}

