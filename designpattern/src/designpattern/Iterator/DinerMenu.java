package designpattern.Iterator;

import java.util.Iterator;

public class DinerMenu implements Menu{
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("채식주의자용 BLT1", "통밀 위에(식물성) 베이컨, 상추, 토마토를 얹은 메뉴", true, 2.99);
		addItem("채식주의자용 BLT2", "통밀 위에(식물성) 베이컨, 상추, 토마토를 얹은 메뉴", false, 2.99);
		addItem("채식주의자용 BLT3", "통밀 위에(식물성) 베이컨, 상추, 토마토를 얹은 메뉴", true, 2.99);
		addItem("채식주의자용 BLT4", "통밀 위에(식물성) 베이컨, 상추, 토마토를 얹은 메뉴", true, 2.99);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if(numberOfItems >= MAX_ITEMS) {
			System.err.println("죄송합니다, 메뉴가 꽉 찼습니다. 더 이상 추가할 수 없습니다.");
		}else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
	
	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}

}
