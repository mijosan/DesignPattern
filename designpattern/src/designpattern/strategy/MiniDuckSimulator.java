package designpattern.strategy;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		mallard.setFlyBehavior(new FlyNoWay());
		mallard.setQuackBehavior(new MuteQuack());
		
		mallard.performFly();
		mallard.performQuack();
	}
}
