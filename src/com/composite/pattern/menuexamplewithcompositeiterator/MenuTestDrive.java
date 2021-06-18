package com.composite.pattern.menuexamplewithcompositeiterator;

public class MenuTestDrive {
	public static void main(String...args) {
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU","Breakfast");
		MenuComponent dinerMenu = new Menu("DINER MENU","Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU","Dinner");
		MenuComponent dessertMenu = new Menu("DESSERT MENU","Dessert of courses!");
		MenuComponent allMenus = new Menu("ALL MENUS","All menus combined");
		allMenus.add(pancakeHouseMenu);
		pancakeHouseMenu.add(new MenuItem("Aloo Prantha","Aloo Prantha with Onion and boiled potato and chilly",true,2.99));
		pancakeHouseMenu.add(new MenuItem("Chicken Sandwich","Sandwich with minced chicken",false,2.99));
		pancakeHouseMenu.add(new MenuItem("Patties","Patties filled with mushroom and other vegetables",true,3.49));
		pancakeHouseMenu.add(new MenuItem("Chicken Patties","Patties filled with minced chicken",false,2.99));
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
		dinerMenu.add(new MenuItem("Pasta","Spaghetti with Marinera Sauce, and a slice of sourdough bread",true,3.89));
		dinerMenu.add(new MenuItem("Chicken Burger","Burger with vegetables and chicken",false,4.99));
		dinerMenu.add(new MenuItem("Pizza","Pizza with Vegetables and Olives",true,4.49));
		dinerMenu.add(dessertMenu);
		dessertMenu.add(new MenuItem("Apple Pie","Apple pie with a flakey crust, topped with vanilla icecream",true,1.59));
		dessertMenu.add(new MenuItem("Pastries","Strawberry Pastries",true,2.99));
		cafeMenu.add(new MenuItem("Dal Makhni with roti","Dal Makhni with butter roti",true,5.59));
		cafeMenu.add(new MenuItem("Kadahi Chicken","Kadahi Chicken with roti",false,7.99));
		
		Waitress waitress = new Waitress(allMenus);
		waitress.printVegetarianMenu();
	}
}
