package designpattern.strategy;

public class FlyNoWay implements FlyBehavior{
	@Override
	public void fly() {
		System.out.println("오리가 날지 못한다.");
	}
}
