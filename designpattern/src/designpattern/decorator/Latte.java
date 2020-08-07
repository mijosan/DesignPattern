package designpattern.decorator;

public class Latte extends Beverage{
	@Override
	public String getDescription() {
		return "Latte";
	}
	
	@Override
	public double cost() {
		return 0.7;
	}
}
