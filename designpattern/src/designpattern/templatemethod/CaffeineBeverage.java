package designpattern.templatemethod;

public abstract class CaffeineBeverage {
	
	/*
	 * 템플릿 메소드
	 * 어떤 알고리즘에 대한 템플릿(틀) 역할을 합니다.
	 * 이경우에는 카페인이 들어있는 음료를 만들기 위한 알고리즘에 대한 템플릿이다.
	 * Coffee와 Tea에 중복된 코드가 있습니다.
	 * 알고리즘이 바뀌면 서브클래스를 일일이 열어서 여러 군데를 고쳐야 하기때문.
	 * 즉 템플릿 메소드 패턴을 사용하면 코드를 재사용 할수 있으며
	 * 알고리즘이 한 군데에 모여 있기 때문에 그 부분만 고치면 된다.
	 */
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	abstract void brew();
	
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("물 끓이는 중");
	}
	
	void pourInCup() {
		System.out.println("컵에 따르는 중");
	}
}
