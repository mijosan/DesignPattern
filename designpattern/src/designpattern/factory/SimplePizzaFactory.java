package designpattern.factory;
/**
 * 
 * 이런식으로 팩토리 클래스를 만들면 피자 객체를 받아서 가격이라든가 피자에 대한 설명 등을 찾아서 활용하는 PizzaShoptMunu
 * 라던가, 아까 봤던 PizzaStore 클래스에서 했던 것과는 조금 다른 방식으로 피자 주문을 처리하는 HomeDeliver 같은 클래스에서도 이 팩토리를 사용할 수 있다.
 *
 */
public class SimplePizzaFactory {
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("cheese")) {
			pizza = new CheesePizza();
		}else if(type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		}else if(type.equals("clam")) {
			pizza = new ClamPizza();
		}else if(type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		
		return pizza;
	}
}
