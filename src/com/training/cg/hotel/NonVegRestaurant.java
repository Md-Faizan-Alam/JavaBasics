package com.training.cg.hotel;

public class NonVegRestaurant implements Hotel{

	@Override
	public Menu getMenus() {
		NonVegMenu nv = new NonVegMenu();
		return nv;
	}
}
