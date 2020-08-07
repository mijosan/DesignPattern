package designpattern.decorator;

public class Milk extends CondimentDecorator{
	Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getSize() {
		return beverage.getSize();
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " milk 추가";
	}
	
	@Override
	public double cost() {
		return beverage.cost() + 0.3;
	}
}
