package designpattern.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{
	ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		
		addItem("K&B 팬케이크 세트1", "스크램블드 에그와 토스트가 곁들여진 팬케이크1", true, 2.99);
		addItem("K&B 팬케이크 세트2", "스크램블드 에그와 토스트가 곁들여진 팬케이크2", false, 3.99);
		addItem("K&B 팬케이크 세트3", "스크램블드 에그와 토스트가 곁들여진 팬케이크3", true, 4.99);
		addItem("K&B 팬케이크 세트4", "스크램블드 에그와 토스트가 곁들여진 팬케이크4", true, 5.99);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	public Iterator createIterator() {
		return menuItems.iterator();
	}
	
}
