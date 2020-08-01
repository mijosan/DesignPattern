package designpattern.strategy;

public class MuteQuack implements QuackBehavior{
	@Override
	public void quack() {
		System.out.println("소리를 내지 않음");
	}
}
