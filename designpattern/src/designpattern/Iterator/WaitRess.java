package designpattern.Iterator;

import java.util.Iterator;

public class WaitRess {
	Menu pancakeHouseMenu;
	Menu dinerMenu;
	
	public WaitRess(Menu pancakeHouseMenu, Menu dinerMenu) {
			
		this.pancakeHouseMenu= pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		
	}
	
	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		
		System.out.println("\n저녁 메뉴");
		printMenu(pancakeIterator);
		printMenu(dinerIterator);
	}
	
	public void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
	
}
