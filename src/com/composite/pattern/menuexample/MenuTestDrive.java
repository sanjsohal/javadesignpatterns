package com.composite.pattern.menuexample;

public class MenuTestDrive {
	public static void main(String...args) {
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU","Breakfast");
		MenuComponent dinerMenu = new Menu("DINER MENU","Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU","Dinner");
		MenuComponent dessertMenu = new Menu("DESSERT MENU","Dessert of courses!");
		MenuComponent allMenus = new Menu("ALL MENUS","All menus combined");
		allMenus.add(pancakeHouseMenu);
		pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast","Pancake with scrambled eggs",true,2.99));
		pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast","Pancake with fried eggs, sausage",false,2.99));
		pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes","Pancake made with fresh blueberries and blueberry syrup",true,3.49));
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
		dinerMenu.add(new MenuItem("Pasta","Spaghetti with Marinera Sauce, and a slice of sourdough bread",true,3.89));
		dinerMenu.add(dessertMenu);
		dessertMenu.add(new MenuItem("Apple Pie","Apple pie with a flakey crust, topped with vanilla icecream",true,1.59));
		
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
	}
}
