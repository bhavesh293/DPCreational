package com.company.project.facade;

import java.util.ArrayList;
import java.util.List;

public class VegMenu implements Menus {

	@Override
	public List<String> getMenuItems() {
		List<String> list = new ArrayList<String>();
		list.add("bhindi");
		list.add("panner");

		return list;
	}

}
