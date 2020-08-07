package designpattern.decorator;

public class Mocha extends CondimentDecorator{
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " mocha 추가";
	}
	
	@Override
	public double cost() {
		return beverage.cost() + 0.4;
	} 
}
