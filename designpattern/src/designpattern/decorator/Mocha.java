package designpattern.decorator;

public class Mocha extends CondimentDecorator{
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getSize() {
		return beverage.getSize();
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " mocha 추가";
	}
	
	@Override
	public double cost() {
		double cost = beverage.cost();

		if(getSize() == "TALL") {
			cost = cost + 0.1;
		}else if(getSize() == "GRANDE") {
			cost = cost + 0.2;
		}else if(getSize() == "VENTI") {
			cost = cost + 0.3;
		}
		
		return cost;
	} 
}
