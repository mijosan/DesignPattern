package designpattern.strategy;

public class FlyWithWings implements FlyBehavior{
	@Override
	public void fly() {
		System.out.println("오리가 난다.");
	}
}
