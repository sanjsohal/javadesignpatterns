package com.iterator.pattern.menuexample.problem;

import java.util.List;

public class Waitress {
	//More the different menu types, more will be the loops to iterate. So this is a problem
	static void printMenu(){
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		List<MenuItem> menuItems = pancakeHouseMenu.getMenuItems();
		for(int i = 0;i<menuItems.size();i++) {
			MenuItem menuItem = menuItems.get(i);
			System.out.println(menuItem.getName()+" ");
			System.out.println(menuItem.getPrice()+" ");
			System.out.println(menuItem.getDescription());
		}
		DinerMenu dinerMenu = new DinerMenu();
		MenuItem[] dinerMenuItems = dinerMenu.getMenuItems();
		for(int i = 0;i<dinerMenuItems.length;i++) {
			MenuItem menuItem = dinerMenuItems[i];
			System.out.println(menuItem.getName()+" ");
			System.out.println(menuItem.getPrice()+" ");
			System.out.println(menuItem.getDescription());
		}
	}
	static void printUsingForEachMenu(){
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		List<MenuItem> menuItems = pancakeHouseMenu.getMenuItems();
		for(MenuItem menuItem:menuItems) {
			System.out.println(menuItem.getName()+" ");
			System.out.println(menuItem.getPrice()+" ");
			System.out.println(menuItem.getDescription());
		}
		DinerMenu dinerMenu = new DinerMenu();
		MenuItem[] dinerMenuItems = dinerMenu.getMenuItems();
		for(MenuItem menuItem:dinerMenuItems) {
			System.out.println(menuItem.getName()+" ");
			System.out.println(menuItem.getPrice()+" ");
			System.out.println(menuItem.getDescription());
		}
	}
	public static void main(String...args) {
		printMenu();
		printUsingForEachMenu();
	}
}
