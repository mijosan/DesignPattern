package designpattern.factory;

public class NYPizzaStore extends PizzaStore{
	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("cheese")) {
			pizza = new NYStyleCheesePizza();
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
