package designpattern.templatemethod;

public class BeverageTestDrive {

	public static void main(String[] args) {
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
		
		System.out.println("커피 준비중...");
		coffeeHook.prepareRecipe();
		
	}

}
