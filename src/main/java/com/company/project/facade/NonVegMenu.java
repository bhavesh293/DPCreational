package com.company.project.facade;

import java.util.ArrayList;
import java.util.List;

public class NonVegMenu implements Menus{
	List<String> list = new ArrayList<String>();

	@Override
	public List<String> getMenuItems() {
		list.add("chicken");
		list.add("mutton");
		
		return list;
	}
	
}
