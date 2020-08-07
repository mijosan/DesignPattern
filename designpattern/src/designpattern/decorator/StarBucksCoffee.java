package designpattern.decorator;

public class StarBucksCoffee {

	public static void main(String[] args) {
		Beverage beverage = new Latte();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		beverage = new Milk(beverage);
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		beverage = new Mocha(beverage);
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Beverage beverage2 = new HouseBlend();
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		beverage2 = new Mocha(new Milk(beverage2));
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
	}

}
