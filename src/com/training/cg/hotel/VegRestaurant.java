package com.training.cg.hotel;

public class VegRestaurant implements Hotel{

	@Override
	public Menu getMenus() {
		VegMenu vm = new VegMenu();
		return vm;
	}
	
}
