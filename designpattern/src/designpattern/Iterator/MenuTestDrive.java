package designpattern.Iterator;

public class MenuTestDrive {
	
	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		
		WaitRess waitRess = new WaitRess(pancakeHouseMenu, dinerMenu);
		
		waitRess.printMenu();
	}
}
