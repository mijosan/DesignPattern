package designpattern.decorator;

public class StarBucksCoffee {

	public static void main(String[] args) {
		Beverage beverage = new Latte();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		beverage = new Mocha(beverage);
		beverage.setSize("GRANDE");
		
		System.out.println(beverage.getDescription() + " $" + beverage.cost());

	}

}
